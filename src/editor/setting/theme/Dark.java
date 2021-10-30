package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// Strategy Pattern
// 第二種樣式(黑色) 
public class Dark implements Theme { 
    @Override 
    public void setTheme(){ 
        new EditorGroup().setTheme(new Color(0,0,0),new Color(255,255,255));
    } 
} 