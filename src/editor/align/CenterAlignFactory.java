package editor.align;

import editor.TextEditor;

public class CenterAlignFactory implements AlignFactory{//實作AlignFactory 對應ConcreteCreator
	private TextEditor textEditor;
	public CenterAlignFactory(TextEditor textEditor) {
		this.textEditor = textEditor;
		// TODO Auto-generated constructor stub
	};
	@Override
	public Align getAlign() {
		// TODO Auto-generated method stub
		return new CenterAlign(textEditor); //呼叫置中的Align
	}

	
}
