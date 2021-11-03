package editor.record;
import editor.TextEditor;
import editor.echar.EcharacterFactory;

//Memento Pattern
//用來控制復原編輯(回到上一步)的動作
public class RecordController {

    //宣告一個Texteditor的變數，名稱為texteditor
    private TextEditor texteditor; 
    //new出RecordCaretaker物件，名稱為careTaker
    private RecordCaretaker careTaker = new RecordCaretaker(); 
    //new出RecordEdits物件，名稱為recordedits
    private RecordEdits recordedits = new RecordEdits(); 
    //宣告一個public 且為boolean值型態的變數restoring，
    //用來檢查是否為復原動作，設定值為false
    private boolean restoring = false; 

    //傳入用戶目前在編輯器上打的文字
    public RecordController(TextEditor texteditor){ 
        this.texteditor = texteditor;
        this.change("");
    } 

    //檢查是否為復原的動作，
    //避免復原到"復原的動作"而產生錯誤
    public void change( String str ) { 
        //如果不是復原的動作
        if (!restoring) { 

            recordedits.addEdits(EcharacterFactory.stringToCharacter(str)); 
            //使用recordedits的addEdits()將打在編輯器上的內容加到
            //RecordEdits Class的edits陣列後面
            //用stringToCharacter將打入的字串轉為字元(減少占用空間)

            careTaker.setMemento(recordedits);
            //將動作(edits)存入RecordCaretaker的Stack裡面
        }
    }

    public void restore() { //復原上一步的動作
        restoring = true; //設定目前為復原的動作
        boolean undo = careTaker.getMemento(recordedits); 
        //一個名稱為undo的Boolean型態變數，
        //將history Stack是否為空的結果，
        //利用getMemento()回傳並設定到undo

        if (undo) { //如果不是空的
            this.texteditor.getTextArea().setText(
                EcharacterFactory.arrayListToString(
                    recordedits.getEdit()
                )
            );
            //利用recordedits的getEdit取得edits(上一步的動作)
            //利用texteditor的setText()將取得的上一步的動作，
            //利用arrayListToString()來將傳回的陣列轉為字串

        } else { //如果是空的
            texteditor.showMsg("Cannot undo!!!", "!!!!!!Cannot undo!!!!!!");
            //顯示無法復原
        }
        restoring = false; //復原後再將此設為不是復原的動作
    }

}
