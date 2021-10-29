package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// 第五種樣式(藍黑色)
public class BlueDark implements Theme { 
    @Override 
    public void setTheme(){ 
        // 變更文字顏色，註解(橘色)、方法(米黃色)、宣告(淺藍色)、型別變數(淺綠色)
        new EditorGroup().setTheme(new Color(12, 26, 39),new Color(255, 255, 204));
    } 
}