// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Demo module

	public static java.lang.String getCelsiusTopic()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Demo.CelsiusTopic");
	}

	public static java.lang.String getConsumerName()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Demo.ConsumerName");
	}

	public static java.lang.String getFahrenheitTopic()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Demo.FahrenheitTopic");
	}

	public static java.lang.String getProcessorName()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Demo.ProcessorName");
	}

	public static java.lang.String getProducerName()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Demo.ProducerName");
	}
}