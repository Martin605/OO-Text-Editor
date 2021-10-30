package editor.gui.menuBar;

import javax.swing.*;
import java.util.ArrayList;

public class MenuItem extends JMenu {

    protected ArrayList<JMenuItem> menuItem = new ArrayList<JMenuItem>();

    MenuItem(String name) {
        super(name);
    }

    protected void addToThis() {
        for (JMenuItem i : this.menuItem ) {
            this.add(i);
        }
    }
}
