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

}
