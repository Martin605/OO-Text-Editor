package editor.gui.os;

import java.awt.Menu;

import editor.gui.menuBar.MenuBar;
import editor.gui.menuBar.MenuItem;

public class WindowAbstractFactory implements Abstractfactory{
	@Override
 	public Menu createMenu()
 	{
	 return new WinMenu();
 	}
	@Override
	public MenuBar createMenuBar()
	{
		return new WinMenuBar();
	}
	@Override
	public MenuItem createMenuItem()
	{
		return new WinMenuItem();
	}
}
