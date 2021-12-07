package editor.sign;

import editor.TextEditor;

// Bridge pattern (Implementor)
public interface AddSignAPI {
    public void add(TextEditor te, String name); 
}
