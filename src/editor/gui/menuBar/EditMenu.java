package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.gui.frame.*;

import java.awt.event.ActionEvent;

public class EditMenu extends MenuItem {
    EditMenu(TextEditor te) {
        super("Edit");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Undo"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        te.getRecordController().restore(); //用戶想要復原
                    }
                }
            )
        );
        this.menuItem.add(new JMenuItem("========"));
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
        this.menuItem.add(new JMenuItem("========"));
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("search"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new SearchFrame(te);
                    }
                }
            )
        );

        this.menuItem.add(new JMenuItem("========"));
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("TextCounterFrame"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new TextCounterFrame(te);
                    }
                }
            )
        );
        this.addToThis();
    }
}