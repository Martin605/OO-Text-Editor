package editor.setting.style;

import java.awt.*;

//Builder Pattern
//擔任Director / Supervisor的角色
public class StyleSet {
	private StyleBuilder styleBuilder;
	public StyleSet(StyleBuilder styleBuilder) {
		this.styleBuilder = styleBuilder;
	}
	
	public Style MainStyle() { //第一種字體風格
		Style style = styleBuilder
				.setsize(12)
				.setFontName("TimesRoman")
				.setFontStyle(Font.PLAIN)
				.build();
		return style;
	}
	public Style NoteStyle() { //第一種字體風格
		Style style = styleBuilder
				.setsize(18)
				.setFontName("Dialog")
				.setFontStyle(Font.BOLD)
				.build();
		return style;
	}
}
