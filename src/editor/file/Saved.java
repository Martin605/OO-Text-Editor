package editor.file;

//State Pattern
//Concrete State
class Saved extends FileState {
    Saved(FileContollor f) {
        f.get_TextEditor().setState("[Saved]");
    }
    void save(FileContollor f) {
    };
    void run(FileContollor f) {
        System.out.println("Run");
    };
    void close(FileContollor f) {
        f.get_TextEditor().dispose();
    };
}
