package editor.setting.style;

//Builder Pattern
//擔任Factory的角色
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
	public Style build() { //創造並回傳設定好的大小、字型、正常或粗體
		return new Style(size,fontName,fontStyle);
	}
}
