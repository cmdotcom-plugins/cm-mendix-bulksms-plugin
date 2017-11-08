// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

public class RestServiceError
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject restServiceErrorMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RestServices.RestServiceError";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		errorMessage("errorMessage"),
		errorCode("errorCode");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public RestServiceError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RestServices.RestServiceError"));
	}

	protected RestServiceError(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject restServiceErrorMendixObject)
	{
		if (restServiceErrorMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RestServices.RestServiceError", restServiceErrorMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RestServices.RestServiceError");

		this.restServiceErrorMendixObject = restServiceErrorMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RestServiceError.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.RestServiceError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return restservices.proxies.RestServiceError.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static restservices.proxies.RestServiceError initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new restservices.proxies.RestServiceError(context, mendixObject);
	}

	public static restservices.proxies.RestServiceError load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.RestServiceError.initialize(context, mendixObject);
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
	 * @return value of errorMessage
	 */
	public final java.lang.String geterrorMessage()
	{
		return geterrorMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of errorMessage
	 */
	public final java.lang.String geterrorMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.errorMessage.toString());
	}

	/**
	 * Set value of errorMessage
	 * @param errormessage
	 */
	public final void seterrorMessage(java.lang.String errormessage)
	{
		seterrorMessage(getContext(), errormessage);
	}

	/**
	 * Set value of errorMessage
	 * @param context
	 * @param errormessage
	 */
	public final void seterrorMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String errormessage)
	{
		getMendixObject().setValue(context, MemberNames.errorMessage.toString(), errormessage);
	}

	/**
	 * @return value of errorCode
	 */
	public final java.lang.String geterrorCode()
	{
		return geterrorCode(getContext());
	}

	/**
	 * @param context
	 * @return value of errorCode
	 */
	public final java.lang.String geterrorCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.errorCode.toString());
	}

	/**
	 * Set value of errorCode
	 * @param errorcode
	 */
	public final void seterrorCode(java.lang.String errorcode)
	{
		seterrorCode(getContext(), errorcode);
	}

	/**
	 * Set value of errorCode
	 * @param context
	 * @param errorcode
	 */
	public final void seterrorCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String errorcode)
	{
		getMendixObject().setValue(context, MemberNames.errorCode.toString(), errorcode);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return restServiceErrorMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final restservices.proxies.RestServiceError that = (restservices.proxies.RestServiceError) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "RestServices.RestServiceError";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
