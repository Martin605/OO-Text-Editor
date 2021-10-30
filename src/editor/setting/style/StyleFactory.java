package editor.setting.style;

public class StyleFactory extends StyleBuilder{
	private int size;
	private String fontName;
	private int  fontStyle;
	
	@Override
	public StyleBuilder setsize(int size) {
		this.size = size;
		return this;
		
	}
	@Override
	public StyleBuilder setFontName(String fontName) {
		this.fontName = fontName;
		return this;
	}
	@Override
	public StyleBuilder setFontStyle(int fontStyle) {
		this.fontStyle = fontStyle;
		return this;
	}
	
	
	@Override
	public Style build() {
		return new Style(size,fontName,fontStyle);
	}
}
