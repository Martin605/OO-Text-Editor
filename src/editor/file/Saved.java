package editor.file;

class Saved extends FileState {
    void save(FileContollor f) {
        System.out.println("not change");
    };
    void run(FileContollor f) {
        System.out.println("Run");
    };
}
