package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// Strategy Pattern
// 第三種樣式(淺灰色)
public class LightGray implements Theme { 
    @Override 
    public void setTheme(){ 
        EditorGroup.getEditorGroup().setTheme(
            new Color(80, 80, 80),
            new Color(255, 250, 250)
        );
    } 
}