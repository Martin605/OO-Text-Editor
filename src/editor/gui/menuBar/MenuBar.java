package editor.gui.menuBar;

import javax.swing.*;
import editor.TextEditor;

public class MenuBar extends JMenuBar {
    public MenuBar(TextEditor textEditor) {
        JMenu fileMenu = new FileMenu(textEditor);
        JMenu editMenu = new EditMenu();
        JMenu ThemeMenu = new ThemeMenu();
        JMenu t = new TestMenu(textEditor);
        this.add(fileMenu);
        this.add(editMenu);
        this.add(ThemeMenu);
        this.add(t);
    }
}
