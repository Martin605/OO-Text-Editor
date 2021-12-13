package editor.gui.color_component.theme_factory;

import editor.gui.color_component.background_color.*;
import editor.gui.color_component.foreground_color.*;

public class LightThemeFactory implements ThemeFactory{

	@Override
	public BackgroundColor createBackgroundColor() {
		return new LightBackgroundColor();
	}

	@Override
	public ForegroundColor createForegroundColor() {
		return new LightForegroundColor();
	}

}
