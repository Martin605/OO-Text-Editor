package editor.align;

import editor.TextEditor;

public class RightAlignFactory implements AlignFactory{//實作AlignFactory 對應ConcreteCreator
	private TextEditor textEditor;
	public RightAlignFactory(TextEditor textEditor) {
		this.textEditor = textEditor;
		// TODO Auto-generated constructor stub
	};
	@Override
	public Align getAlign() {
		// TODO Auto-generated method stub
		return new RightAlign(textEditor);//呼叫靠右的Align
	}
}
