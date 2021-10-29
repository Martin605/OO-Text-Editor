package editor.gui.body;

import java.awt.*;
public class Style {
	
	private int size;
	private String fontName;
	private int  fontStyle;
	private Color color;
		
		
	public Style(int size,String fontName,int fontStyle) {
		this.size = size;
		this.fontName = fontName;
		this.fontStyle = fontStyle;
		
			
	}
	public Font getFont() {
		Font font = new Font(fontName,fontStyle,size);
		return font;
	}
	
	
}
