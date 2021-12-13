package editor.record.action;

import editor.TextEditor;
// Command Pattern
//擔任 Receiver 角色
public interface RecordAction {
    //定義一個方法讓實作此介面的類別去覆寫他
    void action(TextEditor textEditor);
}
