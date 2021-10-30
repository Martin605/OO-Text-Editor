package editor.record;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import editor.TextEditor;


//文字編輯器會使用
public class RecordListener implements DocumentListener{ //繼承JAVA套件的DocumentListener

    TextEditor te; //宣告一個TextEditor的變數te

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
        // this.toRecord(e);
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
            te.getRecordController().change(text);
        } catch (BadLocationException e1) {
            e1.printStackTrace();
        }
    }
}