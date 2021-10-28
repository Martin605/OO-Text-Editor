package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import java.awt.event.ActionEvent;

public class EditMenu extends MenuItem {
    EditMenu(TextEditor te) {
        super("Edit", te);
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("cut"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        te.getTextArea().cut();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("copy"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        te.getTextArea().copy();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("paste"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        te.getTextArea().paste();
                    }
                }
            )
        );
        this.addToThis();
    }
}