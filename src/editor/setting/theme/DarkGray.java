package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// Strategy Pattern
// 第四種樣式(深灰色)
public class DarkGray implements Theme { 
    @Override 
    public void setTheme(){ 
        EditorGroup.getEditorGroup().setTheme(
            new Color(30, 30, 30),
            new Color(255, 250, 250)
        );
    } 
}