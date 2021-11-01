package editor.visitor;

import editor.TextEditor;

// Visitor
public interface Visitor {
	public int visit(TextEditor textEditor);
}