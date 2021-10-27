import java.awt.Color;
import java.util.ArrayList;

public class Windows{

    private static Windows uniqueWindows = new Windows();
    private static ArrayList<TextEditor> windowsList = new ArrayList<TextEditor>();

    public static Windows getWindows() {
        return uniqueWindows;
    }

    public void addWindow(TextEditor textEditor){
        System.out.println(textEditor);
        windowsList.add(textEditor);
    };

    public void removeWindow(TextEditor textEditor){
        windowsList.remove(textEditor);
    }

    public void setTheme() {
        for (TextEditor textEditor : windowsList) {
            textEditor.setTheme(Color.GREEN, Color.RED);
        }
    };

    public void NewEditor() {
        TextEditor textEditor = new TextEditor();
        this.addWindow(textEditor);
    }

} 