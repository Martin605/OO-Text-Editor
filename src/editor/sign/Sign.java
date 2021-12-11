package editor.sign;

import editor.TextEditor;

// Bridge pattern (Abstraction)
public abstract class Sign {
    protected AddSignAPI addSign;
    protected TextEditor textEditor;
    protected String name;
    
    // set Sign api
    protected Sign(AddSignAPI addSign, TextEditor textEditor, String name){       
        this.addSign = addSign;    
        this.textEditor = textEditor;
        this.name = name;
    }

    // add Sign
    public abstract void add();

}
