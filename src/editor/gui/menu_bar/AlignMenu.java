package editor.gui.menu_bar;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenuItem;

import editor.TextEditor;
import editor.align.Align;
import editor.align.AlignFactory;
import editor.align.CenterAlignFactory;
import editor.align.LeftAlignFactory;
import editor.align.RightAlignFactory;

public class AlignMenu extends Menu{
	AlignMenu(TextEditor texteditor) {
		super("Align");
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("RightAlign"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {                  	
	                    	AlignFactory b = new RightAlignFactory(texteditor); //new 對應的Factory                       
	                        Align c = b.getAlign(); //設定Align
	                        c.setAlign();//改變對齊方式
	                    }
	                }
	            )
	        );
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("CenterAlign"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                    	AlignFactory b = new CenterAlignFactory(texteditor);                        
	                        Align c = b.getAlign();
	                        c.setAlign();
	                    }
	                }
	            )
	        );
		this.menuItem.add( 
	            new JMenuItem(
	                new AbstractAction("LeftAlign"){
	                    @Override
	                    public void actionPerformed(ActionEvent e) {	                    	
	                    	AlignFactory b = new LeftAlignFactory(texteditor);                        
	                        Align c = b.getAlign();
	                        c.setAlign();
	                    }
	                }
	            )
	        );
		this.addToThis();
	}
}
