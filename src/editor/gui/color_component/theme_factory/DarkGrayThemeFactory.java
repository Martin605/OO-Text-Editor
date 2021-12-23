package editor.gui.color_component.theme_factory;

import editor.gui.color_component.background_color.*;
import editor.gui.color_component.foreground_color.*;

public class DarkGrayThemeFactory implements ThemeFactory{
	//回傳背景、Bar、字型顏色
	@Override
	public BackgroundColor createBackgroundColor() {
		return new DarkGrayBackgroundColor();
	}

	@Override
	public ForegroundColor createForegroundColor() {
		return new DarkGrayForegroundColor();
	}

}
