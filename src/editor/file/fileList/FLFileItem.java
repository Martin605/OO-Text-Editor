package editor.file.fileList;

import java.io.File;

// Composite Pattern
//Primitive Component (Leaf)
public class FLFileItem implements FLFile {

    private String name;
    private String path;

    protected FLFileItem(String path) {
        File file = new File(path);
        //為了使用File的getName()(File為JAVA內建)，來取得檔案名稱

        this.path = path;
        this.name = file.getName();
        //設定name為檔案名稱
    }

    public String get_name() { //回傳名稱
        return this.name;
    };

    public String get_type() { //回傳類型
        return "file";
        //回傳"檔案"類型
    };

    public String get_path() { //回傳路徑
        return this.path;
    };

}