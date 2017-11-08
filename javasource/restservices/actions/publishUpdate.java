// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.publish.ChangeLogManager;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Publish the provided object to the outer world. This makes sure all external parties relying on the *changes* api of the service to receive an update. 
 * 
 * Note that normal GET operations will work also without publishUpdate actions. 
 * 
 * publishUpdate can be used in afterCommit events
 */
public class publishUpdate extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject source;

	public publishUpdate(IContext context, IMendixObject source)
	{
		super(context);
		this.source = source;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		ChangeLogManager.publishUpdate(getContext(), source);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "publishUpdate";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
