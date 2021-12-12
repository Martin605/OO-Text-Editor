package editor.sign;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;

import editor.TextEditor;

// Bridge pattern (Refined Abstraction)
//也是Template patter (Concrete class 3)
public class Sender extends Sign {

    // setup Sign api
    public Sender(TextEditor textEditor, String name, Boolean needDate, AddSignAPI addSign){       
        super(addSign, textEditor, name, needDate);
    }

    //Oveeride class Sign的abstract方法
    @Override
    public String addWord(){
        return "From: ";
    }

}
