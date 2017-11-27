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

public class StopProducer extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String ProducerName;

	public StopProducer(IContext context, java.lang.String ProducerName)
	{
		super(context);
		this.ProducerName = ProducerName;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		KafkaProducerRepository.close(ProducerName);
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "StopProducer";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
