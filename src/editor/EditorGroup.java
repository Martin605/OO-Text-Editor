package editor;

import java.awt.*;
import java.util.ArrayList;



public class EditorGroup{

    // Singleton Pattern (only can new one EditorGroup)
    private static EditorGroup uniqueEditorGroup = new EditorGroup();
    // Observer Pattern (list)
    private static ArrayList<TextEditor> editorGroupList = new ArrayList<TextEditor>();

    public static EditorGroup getEditorGroup() {
        return uniqueEditorGroup;
    }

    public void addEditor(TextEditor textEditor){
        editorGroupList.add(textEditor);
    };

    public void removeEditor(TextEditor textEditor){
        editorGroupList.remove(textEditor);
    }

    // Observer Pattern (loop)
    public void setTheme(Color background, Color foreground) {
        for (TextEditor textEditor : editorGroupList) {
            textEditor.setTheme(background, foreground);
        }
    };
    public void setFont(Font font) {
    	for (TextEditor textEditor : editorGroupList) {
            textEditor.setFont(font);
        }
    }

    public void createEditor() {
        new TextEditor();
    }

} 