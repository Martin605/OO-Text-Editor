package editor.record.action;

import editor.TextEditor;
// Command Pattern
// Receiver 
public interface RecordAction {
    void action(TextEditor textEditor);
}
