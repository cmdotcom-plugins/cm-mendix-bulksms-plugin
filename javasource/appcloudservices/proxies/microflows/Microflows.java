// This file was generated by Mendix Modeler 7.3.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appcloudservices.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the AppCloudServices module
	public static boolean checkUserRolesRemoved(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.CheckUserRolesRemoved", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void inviteUserToApp(IContext context, java.lang.String _inviteeEmailAddress, system.proxies.UserRole _userRole, java.lang.String _inviterEmailAddress)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("InviteeEmailAddress", _inviteeEmailAddress);
			params.put("UserRole", _userRole == null ? null : _userRole.getMendixObject());
			params.put("InviterEmailAddress", _inviterEmailAddress);
			Core.execute(context, "AppCloudServices.InviteUserToApp", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeOnFirstLoginAppCloudUser(IContext context, java.lang.String _userIdentity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserIdentity", _userIdentity);
			Core.execute(context, "AppCloudServices.InvokeOnFirstLoginAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void invokeOnNonFirstLoginAppCloudUser(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			Core.execute(context, "AppCloudServices.InvokeOnNonFirstLoginAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean provisionAsAppCloudUser(IContext context, system.proxies.User _userAccount, java.lang.String _userIdentity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserAccount", _userAccount == null ? null : _userAccount.getMendixObject());
			params.put("UserIdentity", _userIdentity);
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.ProvisionAsAppCloudUser", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void refreshUserPermissions(IContext context, java.lang.String _openId)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OpenId", _openId);
			Core.execute(context, "AppCloudServices.RefreshUserPermissions", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static profileservice.proxies.UserProfile retrieveUserProfile(IContext context, java.lang.String _userIdentity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("UserIdentity", _userIdentity);
			IMendixObject result = (IMendixObject)Core.execute(context, "AppCloudServices.RetrieveUserProfile", params);
			return result == null ? null : profileservice.proxies.UserProfile.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean retrieveUserRoles(IContext context, system.proxies.User _user)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("User", _user == null ? null : _user.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.RetrieveUserRoles", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean startAppCloudServices(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "AppCloudServices.StartAppCloudServices", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}