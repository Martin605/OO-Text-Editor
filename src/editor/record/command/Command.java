package editor.record.command;

import editor.TextEditor;
import editor.record.action.RecordAction;
// Command Pattern
// 擔任Command的角色
public abstract class Command {
    //宣告一個RecordAction的變數，名稱為receiver
    protected RecordAction receiver;
    //宣告一個Texteditor的變數，名稱為texteditor
    protected TextEditor textEditor; 
    //設定Command的建構子，在建立 Command 物件時或是呼叫他時要傳入型別是RecordAction和TextEditor的物件
    public Command(RecordAction receiver, TextEditor textEditor) {
        //設定RecordAction和TextEditor的值
        this.receiver = receiver;
        this.textEditor = textEditor;
        System.out.println("Command Create");
    }
    //宣告action()方法
    public void action() {
        System.out.println("Command action");
        //呼叫receiver的action方法
        this.receiver.action(textEditor);
    }

}
