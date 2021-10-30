package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;

// Strategy Pattern
// 第一種樣式(白色/預設) 
public class Light implements Theme { //繼承Theme Interface
    @Override 
    public void setTheme(){ //override在Theme class的setTheme()
        new EditorGroup().setTheme(new Color(255,255,255), new Color(0,0,0));
        //使用EditorGroup class中的setTheme()來設定整個文字編輯器的背景和字體顏色
        //new EditorGroup來設定
    } 
} 