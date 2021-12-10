package editor.sign;

import editor.TextEditor;

// Bridge pattern (Refined Abstraction)
// 
public class SampleSign extends Sign {
    private TextEditor textEditor;
    private String name;

    // setup Sign api
    public SampleSign(TextEditor textEditor, String name, AddSignAPI addSign){       
        super(addSign);    
        this.textEditor = textEditor;
        this.name = name;
    }

    // add Sign
    public void add() {
        addSign.add(this.textEditor, this.name);
    };

}
