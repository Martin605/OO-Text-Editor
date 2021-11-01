package editor.file.fileList;

import java.io.File;

// Composite Pattern
//Primitive Component (Leaf)
public class FLFileItem implements FLFile {

    private String name;
    private String path;

    protected FLFileItem(String path) {
        //為了使用File的getName()(File為JAVA內建)，
        //來取得檔案名稱
        File file = new File(path);
        
        this.path = path;
        //設定name為檔案名稱
        this.name = file.getName();
    }

    public String get_name() { 
        //回傳名稱
        return this.name;
    };

    public String get_type() { 
        //回傳類型
        //回傳"檔案"類型
        return "file";
    };

    public String get_path() { 
        //回傳路徑
        return this.path;
    };

}