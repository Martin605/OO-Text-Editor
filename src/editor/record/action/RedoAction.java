package editor.record.action;

import editor.TextEditor;
// Command Pattern
// Concrete receiver
public class RedoAction implements RecordAction {

    @Override
    public void action(TextEditor textEditor) {
        textEditor.getRecordController().unrestore(); 
    }
}
