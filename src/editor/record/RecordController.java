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
        boolean undo = careTaker.getMemento(recordedits);
        if (undo) {
            this.texteditor.getTextArea().setText(EcharacterFactory.arrayListToString(recordedits.getEdit()));
        } else {
            texteditor.showMsg("Cannot undo!!!", "!!!!!!Cannot undo!!!!!!");
        }
        restoring = false;
    }

}
