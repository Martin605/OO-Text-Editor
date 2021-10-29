package editor.gui.menuBar;

import java.util.ArrayList;
import javax.swing.*;
import editor.TextEditor;

public class MenuBar extends JMenuBar {
    public MenuBar(TextEditor textEditor) {
        ArrayList<JMenu> menu = new ArrayList<JMenu>();
        menu.add(new FileMenu(textEditor));
        menu.add(new EditMenu(textEditor));
        menu.add(new ThemeMenu(textEditor));
        menu.add(new TestMenu(textEditor));
        menu.add(new StyleMenu(textEditor));
        for (JMenu i : menu ) {
            this.add(i);
        }
    }
}
