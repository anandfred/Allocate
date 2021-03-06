package flow;

/**
 * The Data class handles many types of server-side operations including data
 * collection (from a data sources such as a database, or web service), variable
 * assignments and operations (like copying variable values, performing mathematic
 * operations, and collection iteration), conditional evaluation to control callflow
 * execution based on variable values, and logging/tracing statements.
 * 
 * Items created in the getDataActions() method are executed/evaluated in order
 * and if a condional branch condition evaluates to "true" then the branch is
 * activated and the execution of data actions is halted.  If no "true" conditions
 * are encountered, then all data actions will be executed/evaluated and the 
 * application will proceed to the "Default" servlet.
 * Last generated by Dialog Designer at: 2007-JUL-30  01:46:30 PM
 */
public class MENU extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2007-JUL-30  01:46:30 PM
	 */
	public MENU() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:26 PM
	 */
	public com.avaya.sce.runtime.Next getNext(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Next next = null;
		return next;
	}
	/**
	 * Creates and conditionally executes operations that have been configured
	 * in the Callflow.  This method will build a collection of operations and
	 * have the framework execute the operations by calling evaluateActions().
	 * If the evaluation causes the framework to forward to a different servlet
	 * then execution stops.
	 * Returning true from this method means that the framework has forwarded the
	 * request to a different servlet.  Returning false means that the default
	 * Next will be invoked.
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:26 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		com.avaya.sce.runtime.Condition condition = null;
		java.util.Collection actions = null;


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition1", "EXTN", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "MENU", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("SET_MENU", "MENU"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition2", "EXTN", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "YES", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("EXTN", "EXTENSION"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		} else {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("ADTSMNT", "DEFAULT"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}
