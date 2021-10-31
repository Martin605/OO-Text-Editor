package editor.file.fileList;

import java.io.File;
import java.util.ArrayList;

// Composite Pattern [C]
public class FLDirectory implements FLFile {

    private String name;
    private String path;
    private ArrayList<FLFile> item = new ArrayList<FLFile>();

    public FLDirectory(String path) {
        File folder = new File(path);
        this.path = path;
        this.name = folder.getName();
        for (final File fileItem : folder.listFiles()) {
            if (fileItem.isDirectory()) {
                this.item.add(new FLDirectory(fileItem.getPath()));
            } else {
                this.item.add(new FLFileItem(fileItem.getPath()));
            }
        }
    }

    public String get_name() {
        return this.name;
    };

    public String get_type() {
        return "directory";
    };

    public String get_path() {
        return this.path;
    };
    
    public ArrayList<FLFile> get_item() {
        return this.item;
    };
}