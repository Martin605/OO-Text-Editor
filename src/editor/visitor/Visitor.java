package editor.visitor;

import editor.TextEditor;

// Visitor Pattern
// Interface Visitor
public interface Visitor {
	public int visit(TextEditor textEditor);
}