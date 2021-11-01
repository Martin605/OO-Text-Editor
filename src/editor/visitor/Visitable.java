package editor.visitor;

// ComIF
public interface Visitable {
    public int accept(Visitor visitor);
}