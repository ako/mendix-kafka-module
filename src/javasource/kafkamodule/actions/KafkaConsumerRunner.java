package kafkamodule.actions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

import com.mendix.logging.ILogNode;

public class KafkaConsumerRunner extends KafkaConfigurable implements Runnable {
    private final AtomicBoolean stopped = new AtomicBoolean(false);
    private final KafkaConsumer<String, String> consumer;
    private final IContext context;
    private final String topic;
    private final String onReceiveMicroflow;
    protected static final ILogNode logger = Core.getLogger("KafkaModule");

    public KafkaConsumerRunner(IMendixObject config, String topic, String onReceiveMicroflow, IContext context) {
        super(config, context);
        String groupId = props.get("group.id").toString();
        logger.info(String.format("Creating kafka consumer: %s, %s, %s", groupId, topic,onReceiveMicroflow));
        if(groupId == null || groupId.equals("")){
            logger.error(String.format("Group id missing for kafka consumer: %s",topic));
        }
        consumer = new KafkaConsumer<>(props);
        logger.info("Done creating kafka consumer");
        this.context = context;
        this.topic = topic;
        this.onReceiveMicroflow = onReceiveMicroflow;
    }

    public void run() {
        try {

            consumer.subscribe(Arrays.asList(topic));
            while (!stopped.get()) {
                ConsumerRecords<String, String> records = consumer.poll(100);
                for (ConsumerRecord<String, String> record : records) {
                    logger.debug(String.format("Message received, executing microflow %s for key %s",onReceiveMicroflow,record.key()));
                    Map<String, Object> microflowParams = new HashMap<String, Object>();
                    microflowParams.put("offset", record.offset());
                    microflowParams.put("key", record.key());
                    microflowParams.put("value", record.value());
                    Core.execute(context, onReceiveMicroflow, microflowParams);    // throws CoreException
                }
            }
        } catch (WakeupException e) {
            // Ignore exception if closing
            if (!stopped.get()) throw e;
        } catch (CoreException e) {
            // Ignore exception if closing
            if (!stopped.get()) {
                WakeupException ex = new WakeupException();
                ex.addSuppressed(e);
                throw ex;
            }
        } finally {
            consumer.close();
        }
    }

    // Shutdown hook which can be called from a separate thread
    public void stop() {
        stopped.set(true);
        consumer.wakeup();
    }
}
