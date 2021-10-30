package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// Strategy Pattern
// 第五種樣式(藍黑色)
public class BlueDark implements Theme { 
    @Override 
    public void setTheme(){ 
        new EditorGroup().setTheme(new Color(12, 26, 39),new Color(255, 255, 204));
    } 
}