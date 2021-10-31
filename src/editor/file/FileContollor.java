package editor.file;

import editor.TextEditor;

//State Patten
//擔任Subject的角色
public class FileContollor {

    private String filename = "";
    private String path = "";
    private TextEditor textEditor;
    private FileState state;

    public FileContollor(TextEditor textEditor) { //建構值，記下目前開啟的編輯器視窗(新檔案)，把狀態設定為未儲存
        this.textEditor = textEditor;
        this.state = new Unsaved(textEditor);
    }

    public void setFileInfo(TextEditor textEditor, String filename, String path) { //建構值，記下目前開啟的編輯器視窗(舊檔案)、檔案名稱和路徑，設定為已儲存的狀態
        this.textEditor = textEditor;
        this.filename = filename;
        this.path = path;
        this.state = new Saved(this);
    }

    public FileState getState() { //取得目前的狀態，會在Concrete Class來使用
        return this.state;
    }

    public void setState(FileState state) { //設定狀態，會在Concrete Class來使用
        this.state = state;
    }

    public void save() { //對應到目前controller
        state.save(this);
    }


    public void close() {
        state.close(this);
    }

    public void editing() { //修改檔案時執行，將檔案狀態設為未儲存
        this.state = new Unsaved(textEditor);
    }

    public String get_name() { //取得檔案名稱
        return this.filename;
    }

    public String get_path() { //取得檔案路徑
        return this.path;
    }

    public TextEditor get_TextEditor() { //取得目前編輯器的視窗
        return this.textEditor;
    }

}
