package editor.align;

import editor.TextEditor;

public class LeftAlignFactory implements AlignFactory{//實作AlignFactory 對應ConcreteCreator
	private TextEditor textEditor;
	public LeftAlignFactory(TextEditor textEditor) {
		this.textEditor = textEditor;
		// TODO Auto-generated constructor stub
	};
	@Override
	public Align getAlign() {
		// TODO Auto-generated method stub
		return new LeftAlign(textEditor);//呼叫靠左的Align
	}
}
