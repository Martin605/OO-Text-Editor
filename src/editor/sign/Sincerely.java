package editor.sign;

import editor.TextEditor;

// Bridge pattern (Refined Abstraction)
// 也有Template pattern(Abstract)
public class Sincerely extends Sign {

    // setup Sign api
    public Sincerely(TextEditor textEditor, String name, Boolean needDate, AddSignAPI addSign){       
        super(addSign, textEditor, name, needDate);
    }

    @Override
    public void addEndWord(){
        addSign.add(this.textEditor, "Your Sincerely,");
    }

}
