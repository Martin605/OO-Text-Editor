package editor.record;

import java.util.ArrayList;
import editor.echar.Estring;
//Memento Pattern
//擔任Memento的角色
public class RecordMemento{
    private ArrayList<Estring> edits;//宣告一個陣列型態的變數Edits

    public RecordMemento(ArrayList<Estring> arrayList)//將複製的陣列(新的編輯動作)設定到edits，
    {
        this.edits = arrayList; 
        //設定陣列為現在的動作
    }

    public ArrayList<Estring> getedits() //負責回傳從history Stack中pop出來的陣列，會在RecordEdits使用
    {
        return edits;
    }

}