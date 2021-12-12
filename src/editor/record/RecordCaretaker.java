package editor.record;
import java.util.Stack;

//擔任Caretaker的角色
public class RecordCaretaker implements Cloneable {
    //Last In First Out後進先出
    //使用Stack來儲存編輯的動作(陣列)
    private Stack<RecordMemento> history = new Stack<>();
    private Stack<RecordMemento> undo_history = new Stack<>();
    
    //儲存新的編輯動作
    public void setMemento(RecordEdits recordedits)
    {
        history.push(recordedits.save()); 
        //用Stack的push方法，
        //來將動作(陣列)存入history裡
        //並利用recordedits的saveToMemento()取得
        //並複製目前的動作存入進去Stack
    }

    //檢查目前的Stack是不是空的，
    //決定取出或回傳錯誤
    public boolean getMemento(RecordEdits recordedits)
    {
        //如果Stack不是空的
        if(!history.isEmpty()) 
        {
            //利用recordedits的restore()，
            //將history的新紀錄
            //(即要復原的動作(陣列))，
            //覆蓋掉最新的陣列，以回到上一步動作
            //利用Stack的pop()來拿出，並刪除
            //目前存在history中的陣列
            RecordMemento last = history.pop();
            undo_history.push(last);
            recordedits.restore(last);
            return true;
        }
        else
        {
            return false;
        }
    }

    //
    //
    public boolean regetMemento(RecordEdits recordedits)
    {
        //如果Stack不是空的
        if(!undo_history.isEmpty()) 
        {
            //利用recordedits的restore()，
            //將history的新紀錄
            //(即要復原的動作(陣列))，
            //覆蓋掉最新的陣列，以回到上一步動作
            //利用Stack的pop()來拿出，並刪除
            //目前存在history中的陣列
            recordedits.restore(undo_history.pop());
            return true;
        }
        else
        {
            return false;
        }
    }
        
    @Override
    public Object clone() throws CloneNotSupportedException {
        RecordCaretaker rc = (RecordCaretaker) super.clone();
        rc.history = (Stack<RecordMemento>) history.clone();
        rc.undo_history = (Stack<RecordMemento>) undo_history.clone();
		return rc;
	} 
}
