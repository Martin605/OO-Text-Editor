package editor.record;

import java.util.ArrayList;
import editor.echar.Echaracter;

//Memento Pattern
//擔任Memento的角色
public class RecordMemento{
    ArrayList<ArrayList<Echaracter>> edits; //宣告一個雙重陣列型態的變數Edits

    public RecordMemento(ArrayList<ArrayList<Echaracter>> arrayList) //將複製的雙重陣列(新的編輯動作)設定到edits，會在RecoedEdits使用來new出一個新的雙重陣列
    {
        this.edits = arrayList; 
        //將雙重陣列設定到edits
    }

    public ArrayList<ArrayList<Echaracter>> getedits() //負責回傳從history Stack中pop出來的雙重陣列，會在RecordEdits使用
    {
        return edits;
    }

}