// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies;

public class ReportedTemperature
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject reportedTemperatureMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Demo.ReportedTemperature";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DateTime("DateTime"),
		Fahrenheit("Fahrenheit"),
		Time("Time");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ReportedTemperature(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Demo.ReportedTemperature"));
	}

	protected ReportedTemperature(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject reportedTemperatureMendixObject)
	{
		if (reportedTemperatureMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Demo.ReportedTemperature", reportedTemperatureMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Demo.ReportedTemperature");

		this.reportedTemperatureMendixObject = reportedTemperatureMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReportedTemperature.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static demo.proxies.ReportedTemperature initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return demo.proxies.ReportedTemperature.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static demo.proxies.ReportedTemperature initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new demo.proxies.ReportedTemperature(context, mendixObject);
	}

	public static demo.proxies.ReportedTemperature load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return demo.proxies.ReportedTemperature.initialize(context, mendixObject);
	}

	public static java.util.List<demo.proxies.ReportedTemperature> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<demo.proxies.ReportedTemperature> result = new java.util.ArrayList<demo.proxies.ReportedTemperature>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Demo.ReportedTemperature" + xpathConstraint))
			result.add(demo.proxies.ReportedTemperature.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of DateTime
	 */
	public final java.util.Date getDateTime()
	{
		return getDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTime
	 */
	public final java.util.Date getDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateTime.toString());
	}

	/**
	 * Set value of DateTime
	 * @param datetime
	 */
	public final void setDateTime(java.util.Date datetime)
	{
		setDateTime(getContext(), datetime);
	}

	/**
	 * Set value of DateTime
	 * @param context
	 * @param datetime
	 */
	public final void setDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datetime)
	{
		getMendixObject().setValue(context, MemberNames.DateTime.toString(), datetime);
	}

	/**
	 * @return value of Fahrenheit
	 */
	public final java.math.BigDecimal getFahrenheit()
	{
		return getFahrenheit(getContext());
	}

	/**
	 * @param context
	 * @return value of Fahrenheit
	 */
	public final java.math.BigDecimal getFahrenheit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Fahrenheit.toString());
	}

	/**
	 * Set value of Fahrenheit
	 * @param fahrenheit
	 */
	public final void setFahrenheit(java.math.BigDecimal fahrenheit)
	{
		setFahrenheit(getContext(), fahrenheit);
	}

	/**
	 * Set value of Fahrenheit
	 * @param context
	 * @param fahrenheit
	 */
	public final void setFahrenheit(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal fahrenheit)
	{
		getMendixObject().setValue(context, MemberNames.Fahrenheit.toString(), fahrenheit);
	}

	/**
	 * @return value of Time
	 */
	public final java.lang.String getTime()
	{
		return getTime(getContext());
	}

	/**
	 * @param context
	 * @return value of Time
	 */
	public final java.lang.String getTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Time.toString());
	}

	/**
	 * Set value of Time
	 * @param time
	 */
	public final void setTime(java.lang.String time)
	{
		setTime(getContext(), time);
	}

	/**
	 * Set value of Time
	 * @param context
	 * @param time
	 */
	public final void setTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String time)
	{
		getMendixObject().setValue(context, MemberNames.Time.toString(), time);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return reportedTemperatureMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final demo.proxies.ReportedTemperature that = (demo.proxies.ReportedTemperature) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Demo.ReportedTemperature";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
