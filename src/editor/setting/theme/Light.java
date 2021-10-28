package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// 第一種樣式(白色/預設) 
public class Light implements Theme { 
    @Override 
    public void setTheme(){ 
        // 變更文字顏色，註解(橘色)、方法(紫色)、宣告(藍色)、型別變數(綠色) 
        new EditorGroup().setTheme(new Color(255,255,255), new Color(0,0,0));
    } 
} 