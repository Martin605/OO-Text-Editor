package editor.file;

abstract class FileState {
    FileState[] states;
    abstract void save(FileContollor f);
    abstract void run(FileContollor f);
}
