package editor.record;

import java.util.ArrayList;
import editor.echar.Estring;
public class RecordMemento{
    ArrayList<Estring> edits;

    public RecordMemento(ArrayList<Estring> arrayList)
    {
        this.edits = arrayList; //這邊是將在originator新增的array(也就是saveToMemento())設定到recordMemento裡
    }

    public ArrayList<Estring> getedits() //取得目前在memento的edits
    {
        return edits;
    }

}