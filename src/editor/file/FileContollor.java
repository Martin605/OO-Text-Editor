package editor.file;

import editor.TextEditor;

// State Patten
public class FileContollor {

    private String filename = "";
    private String path = "";
    private TextEditor textEditor;
    private FileState state;

    public FileContollor(TextEditor textEditor) {
        this.textEditor = textEditor;
        this.state = new Unsaved(textEditor);
    }

    public void setFileInfo(TextEditor textEditor, String filename, String path) {
        this.textEditor = textEditor;
        this.filename = filename;
        this.path = path;
    }

    public FileState getState() {
        return this.state;
    }

    public void setState(FileState state) {
        this.state = state;
    }

    public void save() {
        state.save(this);
    }

    public void run() {
        state.run(this);
    }

    public void close() {
        state.close(this);
    }

    public void editing() {
        this.state = new Unsaved(textEditor);
    }

    public String get_name() {
        return this.filename;
    }

    public String get_path() {
        return this.path;
    }

    public TextEditor get_TextEditor() {
        return this.textEditor;
    }

}
