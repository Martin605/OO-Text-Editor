package editor.setting;

import java.io.*;
import java.util.Properties;

public class Setting {

    Properties properties = new Properties(System.getProperties());

    public Setting() {
        try {
            FileInputStream propFile = new FileInputStream("src/setting.txt");
            properties.load(propFile);
        } catch (IOException e) {}
    }

    public String get(String setting_tag) {
        return properties.getProperty(setting_tag, "");
    }

    public void set(String setting_tag, String data) {
        try {
            FileOutputStream propFile = new FileOutputStream("src/setting.txt");
            properties.setProperty(setting_tag, data);
            properties.store(propFile, null);
        } catch (IOException e) {}
    }

}
