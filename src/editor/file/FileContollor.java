package editor.file;

import editor.TextEditor;

//State Patten
//擔任Subject的角色
public class FileContollor implements Cloneable{

    private String filename = "";
    private String path = "";
    private TextEditor textEditor;
    private FileState state;

    //建構值，記下目前開啟的編輯器視窗(新檔案)，
    //把狀態設定為未儲存
    public FileContollor(TextEditor textEditor) { 
        this.textEditor = textEditor;
        this.state = new Unsaved(textEditor);
    }
    //建構值，記下目前開啟的編輯器視窗(舊檔案)、檔案名稱和路徑，
    //設定為已儲存的狀態
    public void setFileInfo(TextEditor textEditor, String filename, String path) { 
        this.textEditor = textEditor;
        this.filename = filename;
        this.path = path;
        this.state = new Saved(this);
    }

    //取得目前的狀態，
    //會在Concrete Class來使用
    public FileState getState() { 
        return this.state;
    }

    //設定狀態，
    //會在Concrete Class來使用
    public void setState(FileState state) { 
        this.state = state;
    }

    //對應到目前controller
    public void save() { 
        state.save(this);
    }

    public void close() {
        state.close(this);
    }

    //修改檔案時執行，
    //將檔案狀態設為未儲存
    public void editing() { 
        this.state = new Unsaved(textEditor);
    }

    //取得檔案名稱
    public String get_name() { 
        return this.filename;
    }

    //取得檔案路徑
    public String get_path() { 
        return this.path;
    }
    
    //取得目前編輯器的視窗
    public TextEditor get_TextEditor() { 
        return this.textEditor;
    }

    public void set_TextEditor(TextEditor textEditor) { 
        this.textEditor = textEditor;
    }

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	} 

}
