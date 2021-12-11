package editor.record;
import java.util.ArrayList;

import editor.echar.Estring;

//Memento Pattern
//擔任Originator的角色
public class RecordEdits implements Cloneable { //Originator
    //宣告一個陣列型態的物件，名稱為edits
    private ArrayList<Estring> edits = new ArrayList<>(); 

    //將用戶在編輯器打入的字加入edits，
    //會在RecorsController使用
    public void addEdits(Estring arrayList) 
    {
        edits.add(arrayList); 
        //使用陣列的add()加陣列，例([],[])
    }

    //複製新的編輯動作，來存入在RecordCaretaker的Stack裡面
    public ArrayList<Estring> getEdits(ArrayList<Estring> arrayList){
        return (ArrayList<Estring>) arrayList.clone(); 
        //用在當addEdits()執行完之後，
        //將陣列複製，並回傳
    }

    //將新的整個編輯動作存入RecordCaretaker的history Stack裡面，
    //會在RecordCretaker使用
    public RecordMemento save() 
    {
        return new RecordMemento(getEdits(edits)); 
        //使用new和RecordMemento來創造新的物件，並回傳
    }

    //將從history Stack pop出來的動作，
    //設定到(覆蓋)目前的edits，來復原動作
    public void restore(RecordMemento recordmemento) 
    {
        edits = recordmemento.getedits();
        //利用RecordMemento class裡的
        //getedits()來回傳復原的edits，
        //設定到現在的edits
    }

    //取得上一步的動作
    //會在recordController用到
    public Estring getEdit(){ 
        return edits.get(edits.size()-1); 
        //取得目前字串
        //利用陣列的get()來取得上一步動作
        //size()-1是拿最後一個，因size是回傳有多少個，所以須減1
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        RecordEdits re = (RecordEdits) super.clone();
        re.edits = (ArrayList<Estring>) edits.clone();
		return re;
	} 
}
