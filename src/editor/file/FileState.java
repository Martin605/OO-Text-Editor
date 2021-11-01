package editor.file;

//State Pattern
//抽象State
abstract class FileState {
    private FileState[] states;
    //儲存檔案
    public abstract void save(FileContollor f); 
    //關閉檔案
    public abstract void close(FileContollor f); 
}
