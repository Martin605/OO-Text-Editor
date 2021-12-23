package editor.setting.theme;

import java.awt.Color;
import editor.EditorGroup;
import editor.gui.color_component.ColorComponent;
import editor.gui.color_component.theme_factory.*;

// Strategy Pattern
// 第四種樣式(深灰色)
public class DarkGray implements Theme { 
    @Override 
    public void setTheme(){ 
        ThemeFactory themeFactory = new DarkGrayThemeFactory();
        ColorComponent backgroundColor = themeFactory.createBackgroundColor();
        ColorComponent foregroundColor = themeFactory.createForegroundColor();
        EditorGroup.getEditorGroup().setTheme(
            backgroundColor.getColor(), 
            foregroundColor.getColor()
        );
    } 
}