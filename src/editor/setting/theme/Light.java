package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// 第一種樣式(白色/預設) 
public class Light implements Theme { 
    @Override 
    public void setTheme(){ 
        new EditorGroup().setTheme(new Color(255,255,255), new Color(0,0,0));
    } 
} 