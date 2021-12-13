package editor.sign;

import editor.TextEditor;

// Bridge pattern (Refined Abstraction)
// 也有Template pattern (Concrete class 2)
public class Sincerely extends Sign {

    // 設定簽名 api
    public Sincerely(TextEditor textEditor, String name, Boolean needDate, AddSignAPI addSign){       
        super(addSign, textEditor, name, needDate);
    }

    //Oveeride class Sign的abstract方法
    @Override
    public String addWord(){
        return "Your Sincerely,";
    }

}
