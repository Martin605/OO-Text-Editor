package editor.record;
import java.util.Stack;

public class RecordCaretaker {
    //處理多個Memento，如ArrayList
    Stack<RecordMemento> history = new Stack<>();  //Last In First Out

    public void setMemento(RecordEdits recordedits)//設定新的編輯動作到RecordMemento
    {
        history.push(recordedits.saveToMemento()); 
    }

    public boolean getMemento(RecordEdits recordedits)//去RecordMemento取得上一動作
    {
        if(!history.isEmpty()) //如果不是空的
        {
            recordedits.restoreFromMemento(history.pop());
            return true;
        }
        else
        {
            return false;
        }
    }
}
