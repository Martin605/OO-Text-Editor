package editor.record;
import java.util.ArrayList;

public class RecordMemento{
    ArrayList<Edit> edits;

    public RecordMemento(ArrayList<Edit> edits)
    {
        this.edits = edits; //這邊是將在originator新增的array(也就是saveToMemento())設定到recordMemento裡
    }

    public ArrayList<Edit> getedits() //取得目前在memento的edits
    {
        return edits;
    }

}