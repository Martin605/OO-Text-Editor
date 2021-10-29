package editor.record;

import java.util.ArrayList;
import editor.echar.Echaracter;
public class RecordMemento{
    ArrayList<ArrayList<Echaracter>> edits;

    public RecordMemento(ArrayList<ArrayList<Echaracter>> arrayList)
    {
        this.edits = arrayList; //這邊是將在originator新增的array(也就是saveToMemento())設定到recordMemento裡
    }

    public ArrayList<ArrayList<Echaracter>> getedits() //取得目前在memento的edits
    {
        return edits;
    }

}