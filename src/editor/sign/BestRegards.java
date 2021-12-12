package editor.sign;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;

import editor.TextEditor;

// Bridge pattern (Refined Abstraction)
public class BestRegards extends Sign {

    // setup Sign api
    public BestRegards(TextEditor textEditor, String name, Boolean needDate, AddSignAPI addSign){       
        super(addSign, textEditor, name, needDate);
    }
    
    // add Sign
    //public void add() {
    //    SimpleDateFormat sdf = new SimpleDateFormat("d MMMMM, yyyy", Locale.ENGLISH);
    //    addSign.add(this.textEditor, this.name + "\n" + sdf.format(new Date()));
    //};

    @Override
    public void addEndWord(){
        addSign.add(this.textEditor, "Best Regards,");
    }

}
