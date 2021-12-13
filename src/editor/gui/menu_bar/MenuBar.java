package editor.gui.menu_bar;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import editor.TextEditor;

public class MenuBar extends JMenuBar {

    ArrayList<Menu> menu = new ArrayList<Menu>();

    public MenuBar(TextEditor textEditor) {
        menu.add(new FileMenu(textEditor));
        menu.add(new EditMenu(textEditor));
        menu.add(new ThemeMenu());
        menu.add(new StyleMenu());
        menu.add(new ToolMenu(textEditor));
        menu.add(new TestMenu(textEditor));
        for (Menu i : menu ) {
            this.add(i);
        }
    }

    public void setTheme(Color background, Color foreground) {
        this.setBackground(background);
        this.setForeground(foreground);
        for (Menu i : menu ) {
            i.setTheme(background, foreground);
        }
    }
}
