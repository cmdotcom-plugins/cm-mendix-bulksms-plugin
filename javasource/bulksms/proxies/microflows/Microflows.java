// This file was generated by Mendix Modeler 7.3.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bulksms.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the BulkSMS module
	public static void afterStartUp_SMS(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "BulkSMS.AfterStartUp_SMS", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static bulksms.proxies.Message message_Message(IContext context, bulksms.proxies.Message _message)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Message", _message == null ? null : _message.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "BulkSMS.Message_Message", params);
			return result == null ? null : bulksms.proxies.Message.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void pUB_InboundSMS(IContext context, bulksms.proxies.InboundSMS _inboundSMS)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InboundSMS", _inboundSMS == null ? null : _inboundSMS.getMendixObject());
			Core.execute(context, "BulkSMS.PUB_InboundSMS", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void pUB_ReceiveStatusReport(IContext context, bulksms.proxies.statusreport _statusreport)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("statusreport", _statusreport == null ? null : _statusreport.getMendixObject());
			Core.execute(context, "BulkSMS.PUB_ReceiveStatusReport", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static bulksms.proxies.Request request_Request(IContext context, bulksms.proxies.Request _sMS)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SMS", _sMS == null ? null : _sMS.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "BulkSMS.Request_Request", params);
			return result == null ? null : bulksms.proxies.Request.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static bulksms.proxies.Response sUB_BulkSMSCaller(IContext context, java.lang.String _name_From, java.lang.String _text, java.lang.String _productToken, java.util.List<bulksms.proxies.Number> _numberList, java.lang.Long _maxMultiPart, java.lang.Long _minMultiPart)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Name_From", _name_From);
			params.put("Text", _text);
			params.put("ProductToken", _productToken);
			java.util.ArrayList<IMendixObject> listparam_numberList = null;
			if (_numberList != null)
			{
				listparam_numberList = new java.util.ArrayList<IMendixObject>();
				for (bulksms.proxies.Number obj : _numberList)
					listparam_numberList.add(obj.getMendixObject());
			}
			params.put("NumberList", listparam_numberList);
			params.put("MaxMultiPart", _maxMultiPart);
			params.put("MinMultiPart", _minMultiPart);
			IMendixObject result = (IMendixObject)Core.execute(context, "BulkSMS.SUB_BulkSMSCaller", params);
			return result == null ? null : bulksms.proxies.Response.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static bulksms.proxies.Response sUB_SendMultipleSMS(IContext context, java.lang.String _name_From, java.lang.String _text, java.lang.String _productToken, java.util.List<bulksms.proxies.Number> _numberList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Name_From", _name_From);
			params.put("Text", _text);
			params.put("ProductToken", _productToken);
			java.util.ArrayList<IMendixObject> listparam_numberList = null;
			if (_numberList != null)
			{
				listparam_numberList = new java.util.ArrayList<IMendixObject>();
				for (bulksms.proxies.Number obj : _numberList)
					listparam_numberList.add(obj.getMendixObject());
			}
			params.put("NumberList", listparam_numberList);
			IMendixObject result = (IMendixObject)Core.execute(context, "BulkSMS.SUB_SendMultipleSMS", params);
			return result == null ? null : bulksms.proxies.Response.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static bulksms.proxies.Response sUB_SendSMS(IContext context, java.lang.String _text, java.lang.String _phoneNumber_To, java.lang.String _productToken, java.lang.String _name_From)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Text", _text);
			params.put("PhoneNumber_To", _phoneNumber_To);
			params.put("ProductToken", _productToken);
			params.put("Name_From", _name_From);
			IMendixObject result = (IMendixObject)Core.execute(context, "BulkSMS.SUB_SendSMS", params);
			return result == null ? null : bulksms.proxies.Response.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sUB_ValidateRequest(IContext context, java.lang.String _text, java.lang.String _productToken, java.lang.String _name_From, java.util.List<bulksms.proxies.Number> _numberList, java.lang.Long _maxMultiPart, java.lang.Long _minMultiPart)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Text", _text);
			params.put("ProductToken", _productToken);
			params.put("Name_From", _name_From);
			java.util.ArrayList<IMendixObject> listparam_numberList = null;
			if (_numberList != null)
			{
				listparam_numberList = new java.util.ArrayList<IMendixObject>();
				for (bulksms.proxies.Number obj : _numberList)
					listparam_numberList.add(obj.getMendixObject());
			}
			params.put("NumberList", listparam_numberList);
			params.put("MaxMultiPart", _maxMultiPart);
			params.put("MinMultiPart", _minMultiPart);
			return (java.lang.Boolean)Core.execute(context, "BulkSMS.SUB_ValidateRequest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}