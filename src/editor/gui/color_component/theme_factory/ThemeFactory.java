package editor.gui.color_component.theme_factory;

import editor.gui.color_component.background_color.BackgroundColor;
import editor.gui.color_component.foreground_color.ForegroundColor;

public interface ThemeFactory {
    BackgroundColor createBackgroundColor();
    ForegroundColor createForegroundColor();
}
