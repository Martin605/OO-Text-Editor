package editor.visitor;

import editor.TextEditor;

public class TextEditorVisitor implements Visitor {

	@Override
	public int visit(TextEditor textEditor){
		return textEditor.getText().length();
	}
	
}