package editor.record;
import java.util.Stack;

//擔任Caretaker的角色
public class RecordCaretaker {
    Stack<RecordMemento> history = new Stack<>();  //Last In First Out後進先出
    //使用Stack來儲存編輯的動作(雙重陣列)

    public void setMemento(RecordEdits recordedits)//儲存新的編輯動作
    {
        history.push(recordedits.save()); 
        //用Stack的push方法，來將動作(雙重陣列)存入history裡
        //並利用recordedits的saveToMemento()取得並複製目前的動作存入進去Stack
    }

    public boolean getMemento(RecordEdits recordedits)//檢查目前的Stack是不是空的，決定取出或回傳錯誤
    {
        if(!history.isEmpty()) //如果Stack不是空的
        {
            recordedits.restore(history.pop());
            //利用recordedits的restore()，將history的新紀錄(即要復原的動作(雙重陣列))，覆蓋掉最新的雙重陣列，以回到上一步動作
            //利用Stack的pop()來拿出目前存在history中的雙重陣列
            return true;
        }
        else
        {
            return false;
        }
    }
}
