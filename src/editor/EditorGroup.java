package editor;

import java.awt.Color;
import java.util.ArrayList;

public class EditorGroup{

    private static EditorGroup uniqueEditorGroup = new EditorGroup();
    private static ArrayList<TextEditor> EditorGroupList = new ArrayList<TextEditor>();

    public static EditorGroup getEditorGroup() {
        return uniqueEditorGroup;
    }

    public void addWindow(TextEditor textEditor){
        System.out.println(textEditor);
        EditorGroupList.add(textEditor);
    };

    public void removeWindow(TextEditor textEditor){
        EditorGroupList.remove(textEditor);
    }

    public void setTheme(Color background, Color foreground) {
        for (TextEditor textEditor : EditorGroupList) {
            textEditor.setTheme(background, foreground);
        }
    };

    public void CreateEditor() {
        TextEditor textEditor = new TextEditor();
        this.addWindow(textEditor);
    }

} 