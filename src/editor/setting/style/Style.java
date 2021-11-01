package editor.setting.style;

import java.awt.*;

//Builder Pattern
//擔任Product的角色
public class Style {
	
	private int size;
	private String fontName;
	private int  fontStyle;

	//大小、字型、正常或粗體
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
