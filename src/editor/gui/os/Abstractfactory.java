package editor.gui.os;

import java.awt.Menu;

import editor.gui.menuBar.MenuBar;
import editor.gui.menuBar.MenuItem;

public interface Abstractfactory {
 Menu createMenu();
 MenuBar createMenuBar();
 MenuItem createMenuItem();
}
