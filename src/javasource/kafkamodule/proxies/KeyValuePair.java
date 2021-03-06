// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package kafkamodule.proxies;

public class KeyValuePair
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject keyValuePairMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "KafkaModule.KeyValuePair";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		key("key"),
		value("value");

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

	public KeyValuePair(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "KafkaModule.KeyValuePair"));
	}

	protected KeyValuePair(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject keyValuePairMendixObject)
	{
		if (keyValuePairMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("KafkaModule.KeyValuePair", keyValuePairMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a KafkaModule.KeyValuePair");

		this.keyValuePairMendixObject = keyValuePairMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'KeyValuePair.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static kafkamodule.proxies.KeyValuePair initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return kafkamodule.proxies.KeyValuePair.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static kafkamodule.proxies.KeyValuePair initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new kafkamodule.proxies.KeyValuePair(context, mendixObject);
	}

	public static kafkamodule.proxies.KeyValuePair load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return kafkamodule.proxies.KeyValuePair.initialize(context, mendixObject);
	}

	public static java.util.List<kafkamodule.proxies.KeyValuePair> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<kafkamodule.proxies.KeyValuePair> result = new java.util.ArrayList<kafkamodule.proxies.KeyValuePair>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//KafkaModule.KeyValuePair" + xpathConstraint))
			result.add(kafkamodule.proxies.KeyValuePair.initialize(context, obj));
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
	 * @return value of key
	 */
	public final java.lang.String getkey()
	{
		return getkey(getContext());
	}

	/**
	 * @param context
	 * @return value of key
	 */
	public final java.lang.String getkey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.key.toString());
	}

	/**
	 * Set value of key
	 * @param key
	 */
	public final void setkey(java.lang.String key)
	{
		setkey(getContext(), key);
	}

	/**
	 * Set value of key
	 * @param context
	 * @param key
	 */
	public final void setkey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key)
	{
		getMendixObject().setValue(context, MemberNames.key.toString(), key);
	}

	/**
	 * @return value of value
	 */
	public final java.lang.String getvalue()
	{
		return getvalue(getContext());
	}

	/**
	 * @param context
	 * @return value of value
	 */
	public final java.lang.String getvalue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.value.toString());
	}

	/**
	 * Set value of value
	 * @param value
	 */
	public final void setvalue(java.lang.String value)
	{
		setvalue(getContext(), value);
	}

	/**
	 * Set value of value
	 * @param context
	 * @param value
	 */
	public final void setvalue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.value.toString(), value);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return keyValuePairMendixObject;
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
			final kafkamodule.proxies.KeyValuePair that = (kafkamodule.proxies.KeyValuePair) obj;
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
		return "KafkaModule.KeyValuePair";
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
