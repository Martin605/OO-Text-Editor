package editor.setting.style;

import java.awt.*;
public class StyleSet {
	private StyleBuilder styleBuilder;
	public StyleSet(StyleBuilder styleBuilder) {
		this.styleBuilder = styleBuilder;
		// TODO Auto-generated constructor stub
	}
	
	public Style MainStyle() {
		Style style = styleBuilder
				.setsize(12)
				.setFontName("TimesRoman")
				.setFontStyle(Font.PLAIN)
				.build();
		return style;
	}
	public Style NoteStyle() {
		Style style = styleBuilder
				.setsize(18)
				.setFontName("Dialog")
				.setFontStyle(Font.BOLD)
				.build();
		return style;
	}
}
