package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// 第四種樣式(深灰色)
public class DarkGray implements Theme { 
    @Override 
    public void setTheme(){ 
        new EditorGroup().setTheme(new Color(30, 30, 30),new Color(255, 250, 250));
    } 
}