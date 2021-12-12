package editor.sign;

import editor.TextEditor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Bridge pattern (Abstraction)
public abstract class Sign {
    protected AddSignAPI addSign;
    protected TextEditor textEditor;
    protected String name;
    protected Boolean needDate;

    // set Sign api
    protected Sign(AddSignAPI addSign, TextEditor textEditor, String name, Boolean needDate){       
        this.addSign = addSign;    
        this.textEditor = textEditor;
        this.name = name;
        this.needDate = needDate;
    }

    public final void addSignature(){
        addEndWord();
        add();

        if(needDate){
            addDate();
        }
    }

    // add Sign common方法(加名字)
    public void add(){
        addSign.add(this.textEditor, this.name);
    }

    //hook方法(加日期)
    public void addDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMMM, yyyy", Locale.ENGLISH);
        addSign.add(this.textEditor, sdf.format(new Date()));
    }

    //abstract方法(加結尾敬語)
    abstract void addEndWord();

}
