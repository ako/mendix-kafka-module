// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package kafkamodule.proxies;

/**
 * The configuration of a producer. See http://kafka.apache.org/documentation.html#producerconfigs for all configuration options.
 */
public class ProducerConfig extends kafkamodule.proxies.KafkaConfig
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "KafkaModule.ProducerConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		key_serializer("key_serializer"),
		value_serializer("value_serializer"),
		acks("acks"),
		buffer_memory("buffer_memory"),
		compression_type("compression_type"),
		retries("retries"),
		batch_size("batch_size"),
		linger_ms("linger_ms"),
		max_block_ms("max_block_ms"),
		max_request_size("max_request_size"),
		partitioner_class("partitioner_class"),
		enable_idempotence("enable_idempotence"),
		max_in_flight_requests_per_connection("max_in_flight_requests_per_connection"),
		transaction_timeout_ms("transaction_timeout_ms"),
		transactional_id("transactional_id"),
		bootstrap_servers("bootstrap_servers"),
		ssl_key_password("ssl_key_password"),
		ssl_keystore_location("ssl_keystore_location"),
		ssl_keystore_password("ssl_keystore_password"),
		ssl_truststore_location("ssl_truststore_location"),
		ssl_truststore_password("ssl_truststore_password"),
		connections_max_idle_ms("connections_max_idle_ms"),
		receive_buffer_bytes("receive_buffer_bytes"),
		request_timeout_ms("request_timeout_ms"),
		sasl_jaas_config("sasl_jaas_config"),
		sasl_kerberos_service_name("sasl_kerberos_service_name"),
		sasl_mechanism("sasl_mechanism"),
		security_protocol("security_protocol"),
		send_buffer_bytes("send_buffer_bytes"),
		ssl_enabled_protocols("ssl_enabled_protocols"),
		ssl_keystore_type("ssl_keystore_type"),
		ssl_protocol("ssl_protocol"),
		ssl_provider("ssl_provider"),
		ssl_truststore_type("ssl_truststore_type"),
		client_id("client_id"),
		interceptor_classes("interceptor_classes"),
		metadata_max_age_ms("metadata_max_age_ms"),
		metric_reporters("metric_reporters"),
		metrics_num_samples("metrics_num_samples"),
		metrics_recording_level("metrics_recording_level"),
		metrics_sample_window_ms("metrics_sample_window_ms"),
		reconnect_backoff_max_ms("reconnect_backoff_max_ms"),
		reconnect_backoff_ms("reconnect_backoff_ms"),
		retry_backoff_ms("retry_backoff_ms"),
		sasl_kerberos_kinit_cmd("sasl_kerberos_kinit_cmd"),
		sasl_kerberos_min_time_before_relogin("sasl_kerberos_min_time_before_relogin"),
		sasl_kerberos_ticket_renew_jitter("sasl_kerberos_ticket_renew_jitter"),
		sasl_kerberos_ticket_renew_window_factor("sasl_kerberos_ticket_renew_window_factor"),
		ssl_cipher_suites("ssl_cipher_suites"),
		ssl_endpoint_identification_algorithm("ssl_endpoint_identification_algorithm"),
		ssl_keymanager_algorithm("ssl_keymanager_algorithm"),
		ssl_secure_random_implementation("ssl_secure_random_implementation"),
		ssl_trustmanager_algorithm("ssl_trustmanager_algorithm"),
		basic_auth_credentials_source("basic_auth_credentials_source"),
		schema_registry_basic_auth_user_info("schema_registry_basic_auth_user_info"),
		schema_registry_url("schema_registry_url");

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

	public ProducerConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "KafkaModule.ProducerConfig"));
	}

	protected ProducerConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject producerConfigMendixObject)
	{
		super(context, producerConfigMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("KafkaModule.ProducerConfig", producerConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a KafkaModule.ProducerConfig");
	}

	/**
	 * @deprecated Use 'ProducerConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static kafkamodule.proxies.ProducerConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return kafkamodule.proxies.ProducerConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static kafkamodule.proxies.ProducerConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new kafkamodule.proxies.ProducerConfig(context, mendixObject);
	}

	public static kafkamodule.proxies.ProducerConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return kafkamodule.proxies.ProducerConfig.initialize(context, mendixObject);
	}

	public static java.util.List<kafkamodule.proxies.ProducerConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<kafkamodule.proxies.ProducerConfig> result = new java.util.ArrayList<kafkamodule.proxies.ProducerConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//KafkaModule.ProducerConfig" + xpathConstraint))
			result.add(kafkamodule.proxies.ProducerConfig.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of key_serializer
	 */
	public final java.lang.String getkey_serializer()
	{
		return getkey_serializer(getContext());
	}

	/**
	 * @param context
	 * @return value of key_serializer
	 */
	public final java.lang.String getkey_serializer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.key_serializer.toString());
	}

	/**
	 * Set value of key_serializer
	 * @param key_serializer
	 */
	public final void setkey_serializer(java.lang.String key_serializer)
	{
		setkey_serializer(getContext(), key_serializer);
	}

	/**
	 * Set value of key_serializer
	 * @param context
	 * @param key_serializer
	 */
	public final void setkey_serializer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key_serializer)
	{
		getMendixObject().setValue(context, MemberNames.key_serializer.toString(), key_serializer);
	}

	/**
	 * @return value of value_serializer
	 */
	public final java.lang.String getvalue_serializer()
	{
		return getvalue_serializer(getContext());
	}

	/**
	 * @param context
	 * @return value of value_serializer
	 */
	public final java.lang.String getvalue_serializer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.value_serializer.toString());
	}

	/**
	 * Set value of value_serializer
	 * @param value_serializer
	 */
	public final void setvalue_serializer(java.lang.String value_serializer)
	{
		setvalue_serializer(getContext(), value_serializer);
	}

	/**
	 * Set value of value_serializer
	 * @param context
	 * @param value_serializer
	 */
	public final void setvalue_serializer(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value_serializer)
	{
		getMendixObject().setValue(context, MemberNames.value_serializer.toString(), value_serializer);
	}

	/**
	 * @return value of acks
	 */
	public final java.lang.String getacks()
	{
		return getacks(getContext());
	}

	/**
	 * @param context
	 * @return value of acks
	 */
	public final java.lang.String getacks(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.acks.toString());
	}

	/**
	 * Set value of acks
	 * @param acks
	 */
	public final void setacks(java.lang.String acks)
	{
		setacks(getContext(), acks);
	}

	/**
	 * Set value of acks
	 * @param context
	 * @param acks
	 */
	public final void setacks(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String acks)
	{
		getMendixObject().setValue(context, MemberNames.acks.toString(), acks);
	}

	/**
	 * @return value of buffer_memory
	 */
	public final java.lang.Long getbuffer_memory()
	{
		return getbuffer_memory(getContext());
	}

	/**
	 * @param context
	 * @return value of buffer_memory
	 */
	public final java.lang.Long getbuffer_memory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.buffer_memory.toString());
	}

	/**
	 * Set value of buffer_memory
	 * @param buffer_memory
	 */
	public final void setbuffer_memory(java.lang.Long buffer_memory)
	{
		setbuffer_memory(getContext(), buffer_memory);
	}

	/**
	 * Set value of buffer_memory
	 * @param context
	 * @param buffer_memory
	 */
	public final void setbuffer_memory(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long buffer_memory)
	{
		getMendixObject().setValue(context, MemberNames.buffer_memory.toString(), buffer_memory);
	}

	/**
	 * @return value of compression_type
	 */
	public final java.lang.String getcompression_type()
	{
		return getcompression_type(getContext());
	}

	/**
	 * @param context
	 * @return value of compression_type
	 */
	public final java.lang.String getcompression_type(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.compression_type.toString());
	}

	/**
	 * Set value of compression_type
	 * @param compression_type
	 */
	public final void setcompression_type(java.lang.String compression_type)
	{
		setcompression_type(getContext(), compression_type);
	}

	/**
	 * Set value of compression_type
	 * @param context
	 * @param compression_type
	 */
	public final void setcompression_type(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String compression_type)
	{
		getMendixObject().setValue(context, MemberNames.compression_type.toString(), compression_type);
	}

	/**
	 * @return value of retries
	 */
	public final java.lang.Integer getretries()
	{
		return getretries(getContext());
	}

	/**
	 * @param context
	 * @return value of retries
	 */
	public final java.lang.Integer getretries(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.retries.toString());
	}

	/**
	 * Set value of retries
	 * @param retries
	 */
	public final void setretries(java.lang.Integer retries)
	{
		setretries(getContext(), retries);
	}

	/**
	 * Set value of retries
	 * @param context
	 * @param retries
	 */
	public final void setretries(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer retries)
	{
		getMendixObject().setValue(context, MemberNames.retries.toString(), retries);
	}

	/**
	 * @return value of batch_size
	 */
	public final java.lang.Integer getbatch_size()
	{
		return getbatch_size(getContext());
	}

	/**
	 * @param context
	 * @return value of batch_size
	 */
	public final java.lang.Integer getbatch_size(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.batch_size.toString());
	}

	/**
	 * Set value of batch_size
	 * @param batch_size
	 */
	public final void setbatch_size(java.lang.Integer batch_size)
	{
		setbatch_size(getContext(), batch_size);
	}

	/**
	 * Set value of batch_size
	 * @param context
	 * @param batch_size
	 */
	public final void setbatch_size(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer batch_size)
	{
		getMendixObject().setValue(context, MemberNames.batch_size.toString(), batch_size);
	}

	/**
	 * @return value of linger_ms
	 */
	public final java.lang.Integer getlinger_ms()
	{
		return getlinger_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of linger_ms
	 */
	public final java.lang.Integer getlinger_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.linger_ms.toString());
	}

	/**
	 * Set value of linger_ms
	 * @param linger_ms
	 */
	public final void setlinger_ms(java.lang.Integer linger_ms)
	{
		setlinger_ms(getContext(), linger_ms);
	}

	/**
	 * Set value of linger_ms
	 * @param context
	 * @param linger_ms
	 */
	public final void setlinger_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer linger_ms)
	{
		getMendixObject().setValue(context, MemberNames.linger_ms.toString(), linger_ms);
	}

	/**
	 * @return value of max_block_ms
	 */
	public final java.lang.Long getmax_block_ms()
	{
		return getmax_block_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of max_block_ms
	 */
	public final java.lang.Long getmax_block_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.max_block_ms.toString());
	}

	/**
	 * Set value of max_block_ms
	 * @param max_block_ms
	 */
	public final void setmax_block_ms(java.lang.Long max_block_ms)
	{
		setmax_block_ms(getContext(), max_block_ms);
	}

	/**
	 * Set value of max_block_ms
	 * @param context
	 * @param max_block_ms
	 */
	public final void setmax_block_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long max_block_ms)
	{
		getMendixObject().setValue(context, MemberNames.max_block_ms.toString(), max_block_ms);
	}

	/**
	 * @return value of max_request_size
	 */
	public final java.lang.Integer getmax_request_size()
	{
		return getmax_request_size(getContext());
	}

	/**
	 * @param context
	 * @return value of max_request_size
	 */
	public final java.lang.Integer getmax_request_size(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.max_request_size.toString());
	}

	/**
	 * Set value of max_request_size
	 * @param max_request_size
	 */
	public final void setmax_request_size(java.lang.Integer max_request_size)
	{
		setmax_request_size(getContext(), max_request_size);
	}

	/**
	 * Set value of max_request_size
	 * @param context
	 * @param max_request_size
	 */
	public final void setmax_request_size(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer max_request_size)
	{
		getMendixObject().setValue(context, MemberNames.max_request_size.toString(), max_request_size);
	}

	/**
	 * @return value of partitioner_class
	 */
	public final java.lang.String getpartitioner_class()
	{
		return getpartitioner_class(getContext());
	}

	/**
	 * @param context
	 * @return value of partitioner_class
	 */
	public final java.lang.String getpartitioner_class(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.partitioner_class.toString());
	}

	/**
	 * Set value of partitioner_class
	 * @param partitioner_class
	 */
	public final void setpartitioner_class(java.lang.String partitioner_class)
	{
		setpartitioner_class(getContext(), partitioner_class);
	}

	/**
	 * Set value of partitioner_class
	 * @param context
	 * @param partitioner_class
	 */
	public final void setpartitioner_class(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String partitioner_class)
	{
		getMendixObject().setValue(context, MemberNames.partitioner_class.toString(), partitioner_class);
	}

	/**
	 * @return value of enable_idempotence
	 */
	public final java.lang.Boolean getenable_idempotence()
	{
		return getenable_idempotence(getContext());
	}

	/**
	 * @param context
	 * @return value of enable_idempotence
	 */
	public final java.lang.Boolean getenable_idempotence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.enable_idempotence.toString());
	}

	/**
	 * Set value of enable_idempotence
	 * @param enable_idempotence
	 */
	public final void setenable_idempotence(java.lang.Boolean enable_idempotence)
	{
		setenable_idempotence(getContext(), enable_idempotence);
	}

	/**
	 * Set value of enable_idempotence
	 * @param context
	 * @param enable_idempotence
	 */
	public final void setenable_idempotence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean enable_idempotence)
	{
		getMendixObject().setValue(context, MemberNames.enable_idempotence.toString(), enable_idempotence);
	}

	/**
	 * @return value of max_in_flight_requests_per_connection
	 */
	public final java.lang.Integer getmax_in_flight_requests_per_connection()
	{
		return getmax_in_flight_requests_per_connection(getContext());
	}

	/**
	 * @param context
	 * @return value of max_in_flight_requests_per_connection
	 */
	public final java.lang.Integer getmax_in_flight_requests_per_connection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.max_in_flight_requests_per_connection.toString());
	}

	/**
	 * Set value of max_in_flight_requests_per_connection
	 * @param max_in_flight_requests_per_connection
	 */
	public final void setmax_in_flight_requests_per_connection(java.lang.Integer max_in_flight_requests_per_connection)
	{
		setmax_in_flight_requests_per_connection(getContext(), max_in_flight_requests_per_connection);
	}

	/**
	 * Set value of max_in_flight_requests_per_connection
	 * @param context
	 * @param max_in_flight_requests_per_connection
	 */
	public final void setmax_in_flight_requests_per_connection(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer max_in_flight_requests_per_connection)
	{
		getMendixObject().setValue(context, MemberNames.max_in_flight_requests_per_connection.toString(), max_in_flight_requests_per_connection);
	}

	/**
	 * @return value of transaction_timeout_ms
	 */
	public final java.lang.Integer gettransaction_timeout_ms()
	{
		return gettransaction_timeout_ms(getContext());
	}

	/**
	 * @param context
	 * @return value of transaction_timeout_ms
	 */
	public final java.lang.Integer gettransaction_timeout_ms(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.transaction_timeout_ms.toString());
	}

	/**
	 * Set value of transaction_timeout_ms
	 * @param transaction_timeout_ms
	 */
	public final void settransaction_timeout_ms(java.lang.Integer transaction_timeout_ms)
	{
		settransaction_timeout_ms(getContext(), transaction_timeout_ms);
	}

	/**
	 * Set value of transaction_timeout_ms
	 * @param context
	 * @param transaction_timeout_ms
	 */
	public final void settransaction_timeout_ms(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer transaction_timeout_ms)
	{
		getMendixObject().setValue(context, MemberNames.transaction_timeout_ms.toString(), transaction_timeout_ms);
	}

	/**
	 * @return value of transactional_id
	 */
	public final java.lang.String gettransactional_id()
	{
		return gettransactional_id(getContext());
	}

	/**
	 * @param context
	 * @return value of transactional_id
	 */
	public final java.lang.String gettransactional_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.transactional_id.toString());
	}

	/**
	 * Set value of transactional_id
	 * @param transactional_id
	 */
	public final void settransactional_id(java.lang.String transactional_id)
	{
		settransactional_id(getContext(), transactional_id);
	}

	/**
	 * Set value of transactional_id
	 * @param context
	 * @param transactional_id
	 */
	public final void settransactional_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String transactional_id)
	{
		getMendixObject().setValue(context, MemberNames.transactional_id.toString(), transactional_id);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final kafkamodule.proxies.ProducerConfig that = (kafkamodule.proxies.ProducerConfig) obj;
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
		return "KafkaModule.ProducerConfig";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
