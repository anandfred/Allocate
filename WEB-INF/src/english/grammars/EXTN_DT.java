package english.grammars;

/**
 * This class is generated automatically.
 * Only exit this class for Dynamic External grammars and override the method String getURL().
 * Last generated by Dialog Designer at: 2007-JUL-30  12:55:43 PM
 */
public class EXTN_DT extends com.avaya.sce.runtime.Grammar {

    //{{START:CLASS:FIELDS
    //}}END:CLASS:FIELDS

    /**
    * Constructor for EXTN_DT.
    */
    public EXTN_DT() {
		//{{START:CLASS:CONSTRUCTOR
        super();
        setRootLanguage("en-us");
        setMode("dtmf");
        setBuiltin(true);
        setBuiltinMode("dtmf");
        setType("digits");
        setOptions("minlength=5;maxlength=6");
		//}}END:CLASS:CONSTRUCTOR
    }

}

