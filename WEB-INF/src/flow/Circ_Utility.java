package flow;

/**
 * Class that represents a call to a reusable application.
 * Last generated by Dialog Designer at: 2007-JUL-31  03:09:56 PM
 */
public class Circ_Utility extends com.avaya.sce.runtime.Invoke {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2007-JUL-31  03:09:56 PM
	 */
	public Circ_Utility() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * Returns a collection of strings that are the names of the input
	 * parameters of the reusable application being invoked.  If it has
	 * no inputs, then an empty list is returned
	 * Last generated by Dialog Designer at: 2008-JUN-12  12:35:56 PM
	 */
	public java.util.Collection getInputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Parameter param = null;

		throw new com.avaya.sce.runtimecommon.SCERuntimeException("Module \"Circ_Utility\" was not accessable in the development environment at code generation time. Unable to determine the input parameters for the dialog.");
	}
	/**
	 * Returns a collection of strings that are the names of the output parameters
	 * of the reusable application being invoked.  If it has no outputs, then an
	 * empty list is returned
	 * Last generated by Dialog Designer at: 2008-JUN-12  12:35:56 PM
	 */
	public java.util.Collection getOutputParams(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;

		throw new com.avaya.sce.runtimecommon.SCERuntimeException("Module \"Circ_Utility\" was not accessable in the development environment at code generation time. Unable to determine the output parameters for the dialog.");
	}
	/**
	 * Returns the name of the next form in the application
	 * Last generated by Dialog Designer at: 2008-JUN-12  12:35:56 PM
	 */
	public String getNext() {
		return("TEPDSCNT");
	}
	/**
	 * Returns the entry point URL to the application being invoked.
	 * Last generated by Dialog Designer at: 2008-JUN-12  12:35:56 PM
	 */
	public String getWebAppEntryPoint() {
		throw new com.avaya.sce.runtimecommon.SCERuntimeException("Module \"Circ_Utility\" was not accessable in the development environment at code generation time. Unable to determine the entry point for the dialog.");
	}
}
