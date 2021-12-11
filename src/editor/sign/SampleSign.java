package editor.sign;

import editor.TextEditor;

// Bridge pattern (Refined Abstraction)
// 
public class SampleSign extends Sign {

    // setup Sign api
    public SampleSign(TextEditor textEditor, String name, AddSignAPI addSign){       
        super(addSign, textEditor, name);    
    }

    // add Sign
    public void add() {
        addSign.add(this.textEditor, this.name);
    };

}
