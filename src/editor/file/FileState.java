package editor.file;

//State Pattern
//抽象State
abstract class FileState {
    FileState[] states;
    abstract void save(FileContollor f); //儲存檔案
    abstract void close(FileContollor f); //關閉檔案
}
