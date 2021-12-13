package editor.gui.menu_bar;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class Menu extends JMenu {

    protected ArrayList<JMenuItem> menuItem = new ArrayList<JMenuItem>();

    Menu(String name) {
        super(name);
    }

    protected void addToThis() {
        for (JMenuItem i : this.menuItem ) {
            this.add(i);
        }
    }

    public void setTheme(Color background, Color foreground) {
        this.setBackground(background);
        this.setForeground(foreground);
    }

}
