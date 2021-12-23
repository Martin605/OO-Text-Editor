package editor.setting.theme;

import editor.EditorGroup;
import editor.gui.color_component.ColorComponent;
import editor.gui.color_component.theme_factory.*;

// Strategy Pattern
// 第五種樣式(藍黑色)
public class BlueDark implements Theme { 
    @Override 
    public void setTheme(){ 
        ThemeFactory themeFactory = new BlueDarkThemeFactory();
        ColorComponent backgroundColor = themeFactory.createBackgroundColor();
        ColorComponent foregroundColor = themeFactory.createForegroundColor();
        EditorGroup.getEditorGroup().setTheme(
            backgroundColor.getColor(), 
            foregroundColor.getColor()
        );
    } 
}