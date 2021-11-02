package editor.visitor;

// visitor pattern
// ComIF
public interface Visitable {
    public int accept(Visitor visitor);
}