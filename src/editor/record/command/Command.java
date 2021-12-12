package editor.record.command;

import editor.TextEditor;
import editor.record.action.RecordAction;
//
// Command 
public abstract class Command {
    protected RecordAction receiver;
    protected TextEditor textEditor; 
    
    public Command(RecordAction receiver, TextEditor textEditor) {
        this.receiver = receiver;
        this.textEditor = textEditor;
        System.out.println("Command Create");
    }

    public void action() {
        System.out.println("Command action");
        this.receiver.action(textEditor);
    }

}
