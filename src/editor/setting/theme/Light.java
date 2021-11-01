package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// Strategy Pattern
// 第一種樣式(白色/預設) 
//繼承Theme Interface
public class Light implements Theme { 
    //override在Theme class的setTheme()
    @Override 
    public void setTheme(){ 
        new EditorGroup().setTheme(
            new Color(255,255,255), 
            new Color(0,0,0)
        );
        //使用EditorGroup class中的setTheme()
        //來設定整個文字編輯器的背景和字體顏色
        //new EditorGroup來設定
    } 
} 