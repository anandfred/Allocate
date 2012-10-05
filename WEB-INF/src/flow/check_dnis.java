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
 * Last generated by Dialog Designer at: 2007-FEB-05  10:16:09 AM
 */
public class check_dnis extends com.avaya.sce.runtime.Data {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2007-FEB-05  10:16:09 AM
	 */
	public check_dnis() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}
	

	

	/**
	 * Returns the Next item which will forward application execution
	 * to the next form in the call flow.
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
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
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public boolean executeDataActions(com.avaya.sce.runtimecommon.SCESession mySession) throws Exception {
		com.avaya.sce.runtime.Condition condition = null;
		java.util.Collection actions = null;

		// Create the list of actions to execute/evaluate
		actions = new java.util.ArrayList(9);
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "Application Name", "", "APPNAME"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "DNIS ", "DNIS"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "GROUP NAME", "GRPNAME"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "EXTN", "EXTN"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "VDN MENU", "VDNMENU"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "LOG LEVEL", "LOGFILE"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "MSGOFTHEDAY", "MSGDAYPATH"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "", "CONVRSNT_MENU"));
		actions.add(new com.avaya.sce.runtime.tracking.ReportInfo(com.avaya.sce.runtimecommon.IReportInfo.REPORT_TYPE_PROGRESS, com.avaya.sce.runtimecommon.IReportInfo.ALARM_LEVEL_INFO, "", "CONFIGURATION PATH", "CONFIGPATH"));
		if(evaluateActions(actions, mySession)) {
			return true;
		}
		actions = null;

		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition1", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "OPTOUT", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("TVWEEK_OPT_OUT", "TVWEEK_OPT_OUT"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition2", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "NEWEXPRESS", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("EXPRESSTEAM", "NEW_EXPRESS"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition3", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "SUNDAY", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("SUNDAY", "SUNDAY"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition4", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "OLDTV", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("TVWEEK_IVR", "IVR_46355"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition5", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "NEWTV", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("TVWEEK_IVR", "TVWEEK"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition6", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "EXPRESS", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("EXPRESS", "EXPRESS"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition7", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "NOAPP", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("GD_CTI", "NOAPPLICATION"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition8", "GRPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "Accounting", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("ANCE_PAS_WELCOME", "ACCOUNTING"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition9", "GRPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "Paiddeath", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("ANCE_PAS_WELCOME", "PAIDDEATH"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition10", "GRPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "Advertisement", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("ANCE_PAS_WELCOME", "ADVERTISEMENT"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition11", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "Circulation", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("Customer_Service", "CIRCIVR"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition12", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "Zonemanager", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("Circulation_ZoneManager", "ZONEMNGR"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition13", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "Readback", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("Circulation_Readback", "READBACK"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// test the if condition
		condition = new com.avaya.sce.runtime.Condition("condition14", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "1800", false);
		if(condition.evaluate(mySession)) {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("CONVRSNT_IVR", "1-800-IVR"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		} else {

			// Create the list of actions to execute/evaluate
			actions = new java.util.ArrayList(1);
			actions.add(new com.avaya.sce.runtime.Next("SET_NODNIS", "DEFAULT"));
			if(evaluateActions(actions, mySession)) {
				return true;
			}
			actions = null;
		}


		// return false if the evaluation of actions did not cause a servlet forward or redirect
		return false;
	}
}