package editor.record;
import editor.TextEditor;
import editor.echar.EcharacterFactory;

//Memento Pattern
//用來控制復原編輯(回到上一步)的動作
public class RecordController {

    TextEditor texteditor; //宣告一個Texteditor的變數，名稱為texteditor
    RecordCaretaker careTaker = new RecordCaretaker(); //new出RecordCaretaker物件，名稱為careTaker
    RecordEdits recordedits = new RecordEdits(); //new出RecordEdits物件，名稱為recordedits
    boolean restoring = false; //宣告一個public 且為boolean值型態的變數restoring，用來檢查是否為復原動作，設定值為false

    public RecordController(TextEditor texteditor){ //傳入用戶目前在編輯器上打的文字
        this.texteditor = texteditor;
        this.change("");
    } 

    public void change( String str ) { //檢查是否為復原的動作，避免復原到"復原的動作"而產生錯誤
        if (!restoring) { //如果不是復原的動作
            recordedits.addEdits(EcharacterFactory.stringToCharacter(str)); 
            //使用recordedits的addEdits()將打在編輯器上的字母設定到RecordEdits Class的edits陣列(大)裡面
            //用stringToCharacter將打入的字串轉為字元??

            careTaker.setMemento(recordedits);
            //將動作(雙重陣列，也就是edits)存入RecordCaretaker的Stack裡面
        }
    }

    public void restore() { //復原上一步的動作
        restoring = true; //設定目前為復原的動作
        boolean undo = careTaker.getMemento(recordedits); 
        //一個名稱為undo的Boolean型態變數，將history Stack是否為空的結果，利用getMemento()回傳並設定到undo

        if (undo) { //如果不是空的
            this.texteditor.getTextArea().setText(EcharacterFactory.arrayListToString(recordedits.getEdit()));
            //利用recordedits的getEdit取得edits(雙重陣列，上一步的動作)
            //利用texteditor的setText()將取得的上一步的動作，設定回去編輯器的頁面??
            //利用arrayListToString()來將傳回的陣列轉為字串

        } else { //如果是空的
            texteditor.showMsg("Cannot undo!!!", "!!!!!!Cannot undo!!!!!!");
            //顯示無法復原
        }
        restoring = false; //復原後再將此設為不是復原的動作
    }

}
