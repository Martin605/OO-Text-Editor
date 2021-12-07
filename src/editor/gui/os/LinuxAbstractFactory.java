package editor.gui.os;

import java.awt.Menu;

import editor.gui.menuBar.MenuBar;
import editor.gui.menuBar.MenuItem;

public class LinuxAbstractFactory implements Abstractfactory {
	@Override
 	public Menu createMenu()
 	{
	 return new LinuxMenu();
 	}
	@Override
	public MenuBar createMenuBar()
	{
		return new LinuxMenuBar();
	}
	@Override
	public MenuItem createMenuItem()
	{
		return new LinuxMenuItem();
	}
}
