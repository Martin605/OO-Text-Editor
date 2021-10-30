package editor.record;
import java.util.ArrayList;

import editor.echar.Estring;


public class RecordEdits { //Originator
    ArrayList<Estring> edits = new ArrayList<>();


    public void addEdits(Estring arrayList) 
    {
        edits.add(arrayList); //傳入Edit串列，使用新建的edits串列來用add加入 傳入的Edit串列
    }

    public ArrayList<Estring> getEdits(ArrayList<Estring> arrayList){
        return (ArrayList<Estring>) arrayList.clone(); //取得目前存在串列的edits
    }

    public RecordMemento saveToMemento() //用在caretaker的getMemento 存到Memento
    {
        return new RecordMemento(getEdits(edits)); //創造新的edits到Memento
    }

    public void restoreFromMemento(RecordMemento recordmemento) //從Memento復原記錄檔，由caretaker來使用
    {
        edits = recordmemento.getedits();
    }

    public Estring getEdit(){
        return edits.get(edits.size()-1); //取得目前字串
    }

}
