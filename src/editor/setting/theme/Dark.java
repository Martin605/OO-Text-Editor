package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// 第二種樣式(黑色) 
public class Dark implements Theme { 
    @Override 
    public void setTheme(){ 
        // 變更文字顏色，註解(橘色)、方法(黃色)、宣告(淺藍色)、型別變數(湖水綠) 
        new EditorGroup().setTheme(new Color(0,0,0),new Color(255,255,255));
    } 
} 