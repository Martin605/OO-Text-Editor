package editor.file;

import editor.TextEditor;

//State Pattern
//Concrete State
class Unsaved extends FileState {
    Unsaved(TextEditor textEditor) {
        textEditor.setState("[Unsaved]");//秀出目前檔案為未儲存
    }
    void save(FileContollor f) {
        if(new FileAction().save(f.get_TextEditor())) { //如果沒有同樣的檔案
            //利用FileController class的get_TextEdiitor()來取得目前的編輯器視窗名稱?
            //再使用FileAction class的save()來確認檔案是否已經存在，沒有則會執行FileAction class的save_as()
            //接著save_as會取檔案得要存的路徑與名稱，並回傳True，使這邊來執行

            f.setState(new Saved(f)); //就儲存新檔案
            //創造已儲存的FileState物件
            //利用FileController class的setState()，傳入FileState物件，來設定好檔案狀態
        }
    };
    void run(FileContollor f) {
        f.getState().save(f);
        f.getState().run(f);
    };
    void close(FileContollor f) {
        f.getState().save(f);
        f.get_TextEditor().dispose();
    };
}