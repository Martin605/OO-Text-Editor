package editor.file;

class Unsaved extends FileState {
    void save(FileContollor f) {
        new FileAction().save(f.get_TE());
        System.out.println("Save");
        f.setState(new Saved());
    };
    void run(FileContollor f) {
        f.getState().save(f);
        f.getState().run(f);
    };
}