package editor.sign;

import editor.TextEditor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Bridge pattern (Abstraction)
//也是Template patter (Abstract class)
public abstract class Sign {
    protected AddSignAPI addSign;
    protected TextEditor textEditor;
    protected String name;
    protected Boolean needDate;

    // 設定簽名 api
    protected Sign(AddSignAPI addSign, TextEditor textEditor, String name, Boolean needDate){       
        this.addSign = addSign;    
        this.textEditor = textEditor;
        this.name = name;
        this.needDate = needDate;
    }
    //執行新增簽名的動作
    public final void addSignature(){
        //定義簽名模板
        String output="";
        output += addWord() + "\n";
        output += add() + "\n";

        //若為True則加日期
        if(needDate){
            output += addDate();
        }
        //使用AddSignAPI新增簽名至編輯範圍
        addSign.add(this.textEditor, output);
    }

    //common方法-加名字
    public String add(){
        return this.name;
    }

    //hook方法-加日期
    public String addDate(){
        //取得現在的日期
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMMM, yyyy", Locale.ENGLISH);
        return sdf.format(new Date());
    }

    //abstract方法-加From, Sincerely or Best Regards
    abstract String addWord();

}
