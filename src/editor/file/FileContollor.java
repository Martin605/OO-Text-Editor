package editor.file;

public class FileContollor {

    private String filename;
    private String path;
    private FileState state;

    public FileContollor() {
        this.state = new Unsaved();
    }

    public void rename(String filename) {
        this.filename = filename;
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

    public void editing() {
        this.state = new Unsaved();
    }

    public String get_name() {
        return this.filename;
    }

}
