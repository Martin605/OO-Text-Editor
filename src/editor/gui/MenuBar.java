package editor.gui;

import javax.swing.*;
import editor.TextEditor;

public class MenuBar {
    public static JMenuBar init(TextEditor textEditor) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new FileMenu(textEditor);
        JMenu editMenu = new EditMenu();
        JMenu ThemeMenu = new ThemeMenu();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(ThemeMenu);
        return menuBar;
    }
}
