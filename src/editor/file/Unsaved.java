package editor.file;

class Unsaved extends FileState {
    void save(FileContollor f) {
        //save action
        System.out.println("save action");
        f.setState(new Saved());
    };
    void run(FileContollor f) {
        f.getState().save(f);
        f.getState().run(f);
    };
}