// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package kafkamodule.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class StartProducer extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String ProducerName;
	private IMendixObject __Config;
	private kafkamodule.proxies.ProducerConfig Config;

	public StartProducer(IContext context, java.lang.String ProducerName, IMendixObject Config)
	{
		super(context);
		this.ProducerName = ProducerName;
		this.__Config = Config;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.Config = __Config == null ? null : kafkamodule.proxies.ProducerConfig.initialize(getContext(), __Config);

		// BEGIN USER CODE
		KafkaProducerWrapper producer = new KafkaProducerWrapper(__Config, getContext());
		KafkaProducerRepository.put(ProducerName, producer);
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "StartProducer";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
