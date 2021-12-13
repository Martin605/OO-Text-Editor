package editor.setting.theme;

import editor.EditorGroup;
import editor.gui.color_component.ColorComponent;
import editor.gui.color_component.theme_factory.*;

// Strategy Pattern
// 第三種樣式(淺灰色)
public class LightGray implements Theme { 
    @Override 
    public void setTheme(){ 
        ThemeFactory themeFactory = new LightGrayThemeFactory();
        ColorComponent backgroundColor = themeFactory.createBackgroundColor();
        ColorComponent foregroundColor = themeFactory.createForegroundColor();
        EditorGroup.getEditorGroup().setTheme(
            backgroundColor.getColor(), 
            foregroundColor.getColor()
        );
    } 
}