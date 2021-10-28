package editor.record;
import java.util.ArrayList;


public class RecordEdits { //Originator
    ArrayList<Edit> edits = new ArrayList<>();


    public void addEdits(Edit edit) 
    {
        edits.add(edit); //傳入Edit串列，使用新建的edits串列來用add加入 傳入的Edit串列
    }

    public ArrayList<Edit> getEdits(){
        return (ArrayList)edits.clone(); //取得目前存在串列的edits
    }

    public RecordMemento saveToMemento() //用在caretaker的getMemento 存到Memento
    {
        return new RecordMemento(getEdits()); //創造新的edits到Memento
    }

    public void restoreFromMemento(RecordMemento recordmemento) //從Memento復原記錄檔，由caretaker來使用
    {
        edits = recordmemento.getedits();
    }

    @Override
    public String toString()
    {
        return "RecordEdits的edits: " + edits;
    }
}
