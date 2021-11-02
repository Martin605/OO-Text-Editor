package editor.visitor;

import editor.TextEditor;

// visitor pattern
// Visitor Concrete class
public class TextEditorVisitor implements Visitor {

	@Override
	public int visit(TextEditor textEditor){
		return textEditor.getText().length();
	}
	//取得編輯視窗內的文字，並計算長度後回傳
	
}