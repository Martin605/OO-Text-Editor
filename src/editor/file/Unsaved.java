package editor.file;

import editor.TextEditor;

class Unsaved extends FileState {
    Unsaved(TextEditor textEditor) {
        textEditor.setState("[Unsaved]");
    }
    void save(FileContollor f) {
        if(new FileAction().save(f.get_TextEditor())) {
            f.setState(new Saved(f));
        }
    };
    void run(FileContollor f) {
        f.getState().save(f);
        f.getState().run(f);
    };
    void close(FileContollor f) {
        f.getState().save(f);
        f.get_TextEditor().dispose();
    };
}