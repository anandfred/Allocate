package flow;

/**
 * Class that represents a menu.  A menu can contain prompts, choices and links
 * as well as handlers for various events that may occur while the menu is executing
 * Last generated by Dialog Designer at: 2007-AUG-22  05:32:25 PM
 */
public class MENU_NODNIS extends com.avaya.sce.runtime.Menu {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Default constructor
	 * Last generated by Dialog Designer at: 2007-AUG-22  05:32:25 PM
	 */
	public MENU_NODNIS() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}

	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the links for the node, override:
	 *     void updateLinks(Collection links, SCESession mySession)
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 * @return a collection of links
	 */
	public java.util.Collection getLinks(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Link link;
		java.util.List list;
		java.util.Collection grammarInfo = null;
		java.util.Collection<com.avaya.sce.runtime.CaptureExpression> captureExpr = null;
		// This item does not have any defined links
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the properties for the node, override:
	 *     void updateProperties(Collection properties, SCESession mySession)
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 * @return a collection of properties
	 */
	public java.util.Collection getProperties(com.avaya.sce.runtimecommon.SCESession mySession) {
		com.avaya.sce.runtime.Property property;
		java.util.List list;
		// This item does not have any defined properties
		list = new java.util.ArrayList();

		return(list);
	}
	/**
	 * This method is generated automatically and should not be manually edited.
	 * To manually edit the event handlers for the node, override:
	 *    void updateEvents(Collection events, SCESession mySession)
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 * @return a collection of Events
	 */
	public java.util.Collection getEvents(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list;
		com.avaya.sce.runtime.Event event;
		list = new java.util.ArrayList(3);

		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOINPUT, null, new com.avaya.sce.runtime.Throw("NINM", 0, "0"));
		list.add(event);

		event = new com.avaya.sce.runtime.Event(com.avaya.sce.runtimecommon.SCERT.EVENT_NOMATCH, null, new com.avaya.sce.runtime.Throw("NINM", 0, "0"));
		list.add(event);

		event = new com.avaya.sce.runtime.Event("NINM", null, new com.avaya.sce.runtime.Goto("TEPDSCNT", 3, true));
		list.add(event);
		return(list);
	}
	/**
	 * Builds the list of choices for the menu.  This list is built
	 * automatically by the code generator and should not be edited
	 * manually.  Future code generation may overwrite any changes
	 * to this method.<br>
	 * To modify the list of choices, override:<br>
	 *    updateChoices(Collection choices, SCESession mySession)
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public java.util.Collection getChoices(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		com.avaya.sce.runtime.Choice choice = null;
		java.util.Collection grammarInfo = null;
		list = new java.util.ArrayList(3);

		// build the list of grammar information objects for the choice
		grammarInfo = new java.util.ArrayList(1);
		grammarInfo.add(new com.avaya.sce.runtime.GrammarInfo("TEP_ADVERTISING", "1.0"));

		choice = new com.avaya.sce.runtime.Choice("ADVERTISING", "1", "exact", "C2C", grammarInfo, true);
		list.add(choice);

		// build the list of grammar information objects for the choice
		grammarInfo = new java.util.ArrayList(1);
		grammarInfo.add(new com.avaya.sce.runtime.GrammarInfo("TEP_NEWSPAPER", "1.0"));

		choice = new com.avaya.sce.runtime.Choice("DELIVERY", "2", "exact", "Customer_Service", grammarInfo, true);
		list.add(choice);

		// build the list of grammar information objects for the choice
		grammarInfo = new java.util.ArrayList(1);
		grammarInfo.add(new com.avaya.sce.runtime.GrammarInfo("TEP_DISTRIBUTOR", "1.0"));

		choice = new com.avaya.sce.runtime.Choice("DISTRIBUTOR", "3", "exact", "Circulation_Readback", grammarInfo, true);
		list.add(choice);

		return(list);
	}
	/**
	 * Builds the list of prompts that are used by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.  To modify the list
	 * of prompts for the flow item, override:
	 *     updatePrompts(Collection prompts, SCESession mySession)
	 * @return list of prompts for the menu
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public java.util.Collection getPrompts(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;
		list = new java.util.ArrayList(1);

		list.add("NODNIS");

		return(list);
	}
	/**
	 * Builds the list of tracking items that are generated by this flow item<br>
	 * This method is generated automatically and changes to it may
	 * be overwritten next time code is generated.
	 * @return list of tracking items for the item
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:14:25 PM
	 */
	public java.util.Collection getTrackingActions(com.avaya.sce.runtimecommon.SCESession mySession) {
		java.util.List list = null;

		// Item has no tracking items.
		list = new java.util.ArrayList();
		return(list);
	}
}
