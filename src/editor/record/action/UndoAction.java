package editor.record.action;

import editor.TextEditor;
// Command Pattern
// Concrete receiver
public class UndoAction implements RecordAction {

    @Override
    public void action(TextEditor textEditor) {
        System.out.println("undo action");
        textEditor.getRecordController().restore(); 
    }
    
}
