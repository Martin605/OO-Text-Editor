package editor.record;
import editor.TextEditor;
import editor.echar.EcharacterFactory;

public class RecordController {

    TextEditor texteditor;
    RecordCaretaker careTaker = new RecordCaretaker();
    RecordEdits recordedits = new RecordEdits();
    boolean restoring = false;

    public RecordController(TextEditor texteditor){
        this.texteditor = texteditor;
        this.change("");
    } 

    public void change( String str ) {
        if (!restoring) {
            recordedits.addEdits(EcharacterFactory.stringToCharacter(str));
            careTaker.setMemento(recordedits);
        }
    }

    public void restore() {
        restoring = true;
        careTaker.getMemento(recordedits);
        this.texteditor.getTextArea().setText(EcharacterFactory.arrayListToString(recordedits.getEdit()));
        restoring = false;
    }

        // recordedits.addEdits(new Edit("a=1"));

        // recordedits.addEdits(new Edit("b=2"));

        // careTaker.setMemento(recordedits); //用戶按下儲存
        // System.out.println(recordedits);

        
        // recordedits.addEdits(new Edit("c=3"));
        // careTaker.setMemento(recordedits); //用戶按下儲存
        // System.out.println(recordedits);

        // recordedits.addEdits(new Edit("d=4"));
        // careTaker.setMemento(recordedits); //用戶按下儲存
        // System.out.println(recordedits);

        // recordedits.addEdits(new Edit("e=5"));
        // careTaker.setMemento(recordedits); //用戶按下儲存
        // System.out.println(recordedits);

        // careTaker.getMemento(recordedits); //用戶想要復原 會是重複一次，因為用戶將e存進去，是最新的動作，還在caretaker手上
        // System.out.println(recordedits);

        // careTaker.getMemento(recordedits); //用戶想要復原
        // System.out.println(recordedits);

        // careTaker.getMemento(recordedits); //用戶想要復原
        // System.out.println(recordedits);

        // careTaker.getMemento(recordedits); //用戶想要復原
        // System.out.println(recordedits);

        // careTaker.getMemento(recordedits); //用戶想要復原
        // System.out.println(recordedits);

    
}
