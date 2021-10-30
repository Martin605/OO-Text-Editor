package editor.setting.style;

//Builder Pattern
//擔任Builder的角色
public abstract class StyleBuilder {
	protected Style style;
	
	public abstract StyleBuilder setsize(int size);
	public abstract StyleBuilder setFontName(String fontName);
	public abstract StyleBuilder setFontStyle(int fontStyle);	
	public abstract Style build();	
}
