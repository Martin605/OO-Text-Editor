package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// 第三種樣式(淺灰色)
public class LightGray implements Theme { 
    @Override 
    public void setTheme(){ 
        // 變更文字顏色，註解(橘色)、方法(米黃色)、宣告(淺藍色)、型別變數(綠色)
        new EditorGroup().setTheme(new Color(80, 80, 80),new Color(255, 250, 250));
    } 
}