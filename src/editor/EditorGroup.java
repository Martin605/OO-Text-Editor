package editor;

import java.awt.*;
import java.util.ArrayList;



public class EditorGroup{

    // Singleton Pattern (only can new one EditorGroup)
    private static EditorGroup uniqueEditorGroup = new EditorGroup();
    // Observer Pattern (list)
    private static ArrayList<Editor> editorList = new ArrayList<Editor>();

    public static EditorGroup getEditorGroup() {
        return uniqueEditorGroup;
    }

    public void addEditor(Editor textEditor){
        editorList.add(textEditor);
    };

    public void removeEditor(Editor textEditor){
        editorList.remove(textEditor);
    }

    // Observer Pattern (loop)
    public void setTheme(Color background, Color foreground) {
        for (Editor textEditor : editorList) {
            textEditor.update_theme(background, foreground);
        }
    };
    public void setFont(Font font) {
    	for (Editor textEditor : editorList) {
            textEditor.setFont(font);
        }
    }

    public void createEditor() {
        new TextEditor();
    }

} 