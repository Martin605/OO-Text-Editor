package editor.gui.color_component.theme_factory;

import editor.gui.color_component.background_color.*;
import editor.gui.color_component.foreground_color.*;

public class DarkThemeFactory implements ThemeFactory {
	//回傳背景、Bar、字型顏色
	@Override
	public BackgroundColor createBackgroundColor() {
		return new DarkBackgroundColor();
	}

	@Override
	public ForegroundColor createForegroundColor() {
		return new DarkForegroundColor();
	}
	
}
