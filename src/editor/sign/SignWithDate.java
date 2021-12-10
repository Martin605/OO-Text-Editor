package editor.sign;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import editor.TextEditor;

// Bridge pattern (Refined Abstraction)
public class SignWithDate extends Sign {
    private TextEditor textEditor;
    private String name;

    public SignWithDate(TextEditor textEditor, String name, AddSignAPI addSign){       
        super(addSign);    
        this.textEditor = textEditor;
        this.name = name;
    }

    public void add() {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMMM, yyyy", Locale.ENGLISH);
        addSign.add(this.textEditor, this.name + "\n" + sdf.format(new Date()));
    };

}
