package editor;

import java.awt.*;
import javax.swing.*;

public abstract class Editor extends JFrame {

    protected Editor(String name) {
        super(name);
        EditorGroup.getEditorGroup().addEditor(this);
    }

    public abstract void update_theme(Color background, Color foreground);
    public abstract void update_Font(Font font);

}
