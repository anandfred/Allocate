/**
 * Last generated by Dialog Designer at: 2007-JUL-30  01:03:28 PM
 */
package english.prompts;

public class PR_WELCOME extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for PR_WELCOME.
	 */
	public PR_WELCOME() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Dialog Designer at: 2010-SEP-03  03:00:56 PM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("PR_WELCOME");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,5000);
		setBargin(1,false);

		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "NAUSR", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4102"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "MAUSR", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4103"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "SIURC", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4109"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "PRPMG", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4104"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "CLAUT", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4106"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL, "BDUSR", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4107"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "SIUSR", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4108"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "SIURL", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4109"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "JAUSL", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4111"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "JAUSR", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4112"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "C2C", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4113"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "PDTH", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4115"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "NACCT", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4116"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "CACCT", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4118"));
		}
		if ( new com.avaya.sce.runtime.Condition( "condition", "APPNAME", com.avaya.sce.runtime.Condition.STRING_EQUAL_IGNORE, "CACN", false, null ).evaluate(getSession()) == true ) {
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.PHRASE,"PAS_4117"));
		}

		format = new com.avaya.sce.runtime.Format();
		format.add("gender","female");
		format.add("age","10");
		format.add("variant","3");
		format.add("name","Samantha");
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.XML_TAG_BEGIN,"voice", format));
			format = new com.avaya.sce.runtime.Format();
			format.add("interpret-as","words");
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.XML_TAG_BEGIN,"say-as", format));
				format = new com.avaya.sce.runtime.Format();
				format.add("pitch","medium");
				format.add("range","medium");
				format.add("rate","medium");
				format.add("volume","soft");
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.XML_TAG_BEGIN,"prosody", format));
					format = new com.avaya.sce.runtime.Format();
					format.add(com.avaya.sce.runtime.Format.FORMAT,com.avaya.sce.runtime.Format.FMT_TEXT);
					add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.VARIABLE_TEXT,"MSGOFDAY", format));
				add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.XML_TAG_END,"prosody"));
			add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.XML_TAG_END,"say-as"));
		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.XML_TAG_END,"voice"));

	}}
