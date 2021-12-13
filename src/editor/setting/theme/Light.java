package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;
import editor.gui.color_component.*;
import editor.gui.color_component.theme_factory.*;

// Strategy Pattern
// 第一種樣式(白色/預設) 
//繼承Theme Interface
public class Light implements Theme { 
    //override在Theme class的setTheme()
    @Override 
    public void setTheme(){ 
        ThemeFactory themeFactory = new LightThemeFactory();
        ColorComponent backgroundColor = themeFactory.createBackgroundColor();
        ColorComponent foregroundColor = themeFactory.createForegroundColor();
        EditorGroup.getEditorGroup().setTheme(
            backgroundColor.getColor(), 
            foregroundColor.getColor()
        );
        //使用EditorGroup class中的setTheme()
        //來設定整個文字編輯器的背景和字體顏色

    } 
} 