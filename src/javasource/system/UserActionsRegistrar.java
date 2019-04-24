package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(kafkamodule.actions.Send.class);
    registrator.registerUserAction(kafkamodule.actions.StartConsumer.class);
    registrator.registerUserAction(kafkamodule.actions.StartFilteredProcessor.class);
    registrator.registerUserAction(kafkamodule.actions.StartProcessor.class);
    registrator.registerUserAction(kafkamodule.actions.StartProducer.class);
    registrator.registerUserAction(kafkamodule.actions.StopAll.class);
    registrator.registerUserAction(kafkamodule.actions.StopConsumer.class);
    registrator.registerUserAction(kafkamodule.actions.StopProcessor.class);
    registrator.registerUserAction(kafkamodule.actions.StopProducer.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
