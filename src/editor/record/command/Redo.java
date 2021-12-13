package editor.record.command;

import editor.TextEditor;
import editor.record.action.RecordAction;
// Command Pattern
// 擔任ConcreteCommand的角色
public class Redo extends Command {
    //在建立 Redo 時，傳入RecordAction和TextEditor的物件
    public Redo(RecordAction receiver, TextEditor textEditor) {
        //並呼叫父類別Command的建構子
        super(receiver, textEditor);
        //System.out.println("Redo create");
    }

}
