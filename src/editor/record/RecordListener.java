package editor.record;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import editor.TextEditor;
import editor.echar.EcharacterFactory;

public class RecordListener implements DocumentListener{

    TextEditor te;
    RecordCaretaker careTaker = new RecordCaretaker();
    RecordEdits recordedits = new RecordEdits();

    public RecordListener(TextEditor te) {
        this.te = te;
        te.getTextArea().getDocument().addDocumentListener(this);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        this.toRecord(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        this.toRecord(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        this.toRecord(e);
    }

    public void toRecord(DocumentEvent e) {
        Document doc = (Document)e.getDocument();
        try {
            this.te.getFileContollor().editing();
            String text = doc.getText(0, doc.getLength());
            System.out.println(EcharacterFactory.StringToCharacter(text));
            //recordedits.addEdits(EcharacterFactory.StringToCharacter(text));
            // careTaker.setMemento(recordedits);
            // System.out.println(recordedits);
        } catch (BadLocationException e1) {
            // TODO Auto-generated catch block            e1.printStackTrace();
        }
    }
}