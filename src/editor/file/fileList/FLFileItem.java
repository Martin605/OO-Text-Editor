package editor.file.fileList;

import java.io.File;

// Composite Pattern [L]
public class FLFileItem implements FLFile {

    private String name;
    private String path;

    protected FLFileItem(String path) {
        File file = new File(path);
        this.path = path;
        this.name = file.getName();
    }

    public String get_name() {
        return this.name;
    };

    public String get_type() {
        return "file";
    };

    public String get_path() {
        return this.path;
    };

}