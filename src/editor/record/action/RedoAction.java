package editor.record.action;

import editor.TextEditor;
// Command Pattern
// 擔任 Concrete receiver的角色
public class RedoAction implements RecordAction {
    //覆寫RecordAction的action方法將此方法實作出來
    @Override
    public void action(TextEditor textEditor) {
        //透過textEditor物件中的getRecordController()方法
        //取得RecordController的物件並呼叫restore方法做出Redo的功能
        textEditor.getRecordController().unrestore(); 
    }
}
