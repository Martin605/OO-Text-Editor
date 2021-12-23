package editor.setting.theme;

import editor.EditorGroup;
import editor.gui.color_component.*;
import editor.gui.color_component.theme_factory.*;

// Strategy Pattern
// 第二種樣式(黑色) 
public class Dark implements Theme { 
    @Override 
    public void setTheme(){ 
        ThemeFactory themeFactory = new DarkThemeFactory();
        ColorComponent backgroundColor = themeFactory.createBackgroundColor();
        ColorComponent foregroundColor = themeFactory.createForegroundColor();
        EditorGroup.getEditorGroup().setTheme(
            backgroundColor.getColor(), 
            foregroundColor.getColor()
        );
    } 
} 