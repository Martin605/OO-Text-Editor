package editor.record.command;

import editor.TextEditor;
import editor.record.action.RecordAction;
//
// ConcreteCommand 
public class Redo extends Command {

    public Redo(RecordAction receiver, TextEditor textEditor) {
        super(receiver, textEditor);
        System.out.println("Redo create");
    }

}
