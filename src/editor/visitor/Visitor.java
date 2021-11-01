package editor.visitor;

import editor.TextEditor;

// Visitor
public interface Visitor {
	int visit(TextEditor textEditor);
	
}