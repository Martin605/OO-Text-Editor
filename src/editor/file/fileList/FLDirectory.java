package editor.file.fileList;

import java.io.File;
import java.util.ArrayList;

// Composite Pattern
//Composite Component
public class FLDirectory implements FLFile {

    private String name;
    private String path;
    private ArrayList<FLFile> item = new ArrayList<FLFile>(); //儲存多個檔案

    public FLDirectory(String path) {
        File folder = new File(path);
        //為了使用File的getName()(File為JAVA內建)，
        //來取得資料夾名稱

        this.path = path;
        //設定name為資料夾名稱
        this.name = folder.getName();
        
        //巡資料夾裡的檔案
        for (final File fileItem : folder.listFiles()) { 
            //如果是資料夾
            if (fileItem.isDirectory()) { 
                //建立一個資料夾類型，利用getPath()取得資料夾路徑，
                //並new一個FLDirectory物件
                //利用add()將之加入陣列裡
                this.item.add(new FLDirectory(fileItem.getPath()));
            } else { //如果不是資料夾
                //建立一個檔案類型，取得檔案路徑，
                //並new出FLFileItem物件
                this.item.add(new FLFileItem(fileItem.getPath()));
            }
        }
    }

    public String get_name() {
        return this.name;
    };

    public String get_type() { 
        //回傳"目錄"類型
        return "directory";
    };

    public String get_path() {
        return this.path;
    };
    
    public ArrayList<FLFile> get_item() {
        return this.item;
    };
}