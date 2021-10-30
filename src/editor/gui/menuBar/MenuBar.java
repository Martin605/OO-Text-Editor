package editor.gui.menuBar;

import java.util.ArrayList;
import javax.swing.*;
import editor.TextEditor;

public class MenuBar extends JMenuBar {
    public MenuBar(TextEditor textEditor) {
        ArrayList<JMenu> menu = new ArrayList<JMenu>();
        menu.add(new FileMenu(textEditor));
        menu.add(new EditMenu(textEditor));
        menu.add(new ThemeMenu());
        menu.add(new StyleMenu());
        menu.add(new ToolMenu(textEditor));
        menu.add(new TestMenu(textEditor));
        for (JMenu i : menu ) {
            this.add(i);
        }
    }
}
