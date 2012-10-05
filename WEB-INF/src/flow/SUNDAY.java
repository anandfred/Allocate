package flow;

/**
 * Class that represents a call to a reusable application.
 * Last generated by Dialog Designer at: 2009-MAY-04  03:55:22 PM
 */
public class SUNDAY extends com.avaya.sce.runtime.Invoke {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2009-MAY-04  03:55:22 PM
	 */
	public SUNDAY() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns a collection of strings that are the names of the input
	 * parameters of the reusable application being invoked.  If it has
	 * no inputs, then an empty list is returned
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public java.util.Collection getInputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Parameter param = null;
		list = new java.util.ArrayList(1);

		param = new com.avaya.sce.runtime.Parameter("CONFIGPATH", "CONFIGPATH", com.avaya.sce.runtime.Parameter.VARIABLE);
		list.add(param);

		return(list);
	}
	/**
	 * Returns a collection of strings that are the names of the output parameters
	 * of the reusable application being invoked.  If it has no outputs, then an
	 * empty list is returned
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public java.util.Collection getOutputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * Returns the name of the next form in the application
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public String getNext() {
		return("tepstop");
	}
	/**
	 * Returns the entry point URL to the application being invoked.
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public String getWebAppEntryPoint() {
		return("SUNDAY/Start");
	}
}
