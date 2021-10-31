package editor.file;

//State Pattern
//Concrete State
class Saved extends FileState {
    Saved(FileContollor f) {
        f.get_TextEditor().setState("[Saved]"); //取得目前編輯器的視窗，並設定的檔案狀態標題為已儲存
    }

    @Override
    void save(FileContollor f) { //因為目前已經是已儲存，不用執行此動作
    };

    @Override
    void close(FileContollor f) { //找到目前編輯器的視窗，用dispose()(JAVA內建)來關掉此視窗
        f.get_TextEditor().dispose();
    };
}
