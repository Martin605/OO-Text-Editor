package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// 第四種樣式(深灰色)
public class DarkGray implements Theme { 
    @Override 
    public void setTheme(){ 
        // 變更文字顏色，註解(橘色)、方法(米黃色)、宣告(淺藍色)、型別變數(淺綠色)
        new EditorGroup().setTheme(new Color(30, 30, 30),new Color(255, 250, 250));
    } 
}