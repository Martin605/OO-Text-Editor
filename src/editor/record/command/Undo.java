package editor.record.command;

import editor.TextEditor;
import editor.record.action.RecordAction;
//
// ConcreteCommand 
public class Undo extends Command {

    public Undo(RecordAction receiver, TextEditor textEditor) {
        super(receiver, textEditor);
        System.out.println("Undo create");
    }

}
