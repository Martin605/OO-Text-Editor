package editor.gui.menu_bar;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenuItem;

import editor.EditorGroup;
import editor.setting.style.*;

public class StyleMenu extends Menu {

	StyleFactory stylefactory = new StyleFactory(); 
	StyleSet styleset = new StyleSet(stylefactory);
	
	StyleMenu() {
		super("Style");
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("Style1"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                    	Style style1 = styleset.MainStyle();
	                    	EditorGroup.getEditorGroup().setFont(style1.getFont());
	                    }
	                }
	            )
	        );
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("Style2"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                    	Style style2 = styleset.NoteStyle();
	                    	EditorGroup.getEditorGroup().setFont(style2.getFont());
	                    }
	                }
	            )
	        );
		this.addToThis();
	}

}
