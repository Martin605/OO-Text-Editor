package editor.gui.menuBar;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenuItem;

import editor.EditorGroup;
import editor.TextEditor;
import editor.gui.body.Style;
import editor.gui.body.StyleFactory;
import editor.gui.body.StyleSet;
import editor.gui.body.TextArea;

public class StyleMenu extends MenuItem {
	public TextEditor textEditer;
	StyleFactory stylefactory = new StyleFactory(); 
	StyleSet styleset = new StyleSet(stylefactory);
	
	StyleMenu(TextEditor te) {
		super("Style", te);
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("Style1"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                    	Style style1 = styleset.MainStyle();
	                    	new EditorGroup().setFont(style1.getFont());
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
	                    	new EditorGroup().setFont(style2.getFont());
	                    }
	                }
	            )
	        );
		// TODO Auto-generated constructor stub
		this.addToThis();
	}

}
