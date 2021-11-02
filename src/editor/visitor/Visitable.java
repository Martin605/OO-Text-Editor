package editor.visitor;

// visitor pattern
//抽象類別 ComIF 元素
public interface Visitable {
    public int accept(Visitor visitor);
}