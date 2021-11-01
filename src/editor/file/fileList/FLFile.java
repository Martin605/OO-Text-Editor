package editor.file.fileList;

//Composite Pattern 
//抽象Component
public interface FLFile {
    //取得名稱
    public String get_name(); 
    //取得類型
    public String get_type(); 
     //取得路徑
    public String get_path();
}