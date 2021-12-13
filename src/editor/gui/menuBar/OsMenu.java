package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenuItem;
import editor.EditorGroup;
import editor.gui.os.*;
public class OsMenu extends MenuItem {

	StyleFactory stylefactory = new StyleFactory(); 
	StyleSet styleset = new StyleSet(stylefactory);
	
	OsMenu() {
		super("OSstyle");
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("Windows"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                    	Abstractfactory Windowsfactory = new WindowAbstractFactory();
	                    	Product1 windows = Windowsfactory.get();
	                    }
	                }
	            )
	        );
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("Linux"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                    	Abstractfactory Linuxfactory = new LinuxAbstractFactory();
	                    	Product2 windows = Linuxfactory.get();
	                    }
	                }
	            )
	        );
		this.addToThis();
	}

}
