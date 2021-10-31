package editor.file;

import editor.TextEditor;

//State Pattern
//Concrete State
class Unsaved extends FileState {
    Unsaved(TextEditor textEditor) {
        textEditor.set_title("[Unsaved]");////取得目前編輯器的視窗，並設定的檔案狀態標題為未儲存
    }

    @Override
    void save(FileContollor f) {
        if(new FileAction().save(f.get_TextEditor())) { //如果沒有同樣的檔案
            //利用FileController class的get_TextEdiitor()來取得目前的編輯器視窗
            //再使用FileAction class的save()來確認檔案是否已經存在，沒有則會執行FileAction class的save_as()
            //接著save_as會取檔案得要存的路徑與名稱，並回傳True，使這邊來執行

            f.setState(new Saved(f)); //改檔案目前的狀態為已儲存
            //創造已儲存的FileState物件
            //利用FileController class的setState()，傳入FileState物件，來設定好檔案狀態
        }
    };

    void close(FileContollor f) { //關閉前會執行檔案儲存
        this.save(f);
        //執行儲存，是第13行的save()

        f.get_TextEditor().dispose();
        //找到目前編輯器的視窗，用dispose()(JAVA內建)來關掉此視窗
    };
}