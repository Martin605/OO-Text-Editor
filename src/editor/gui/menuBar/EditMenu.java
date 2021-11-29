package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;

import java.awt.event.ActionEvent;

public class EditMenu extends MenuItem {
    EditMenu(TextEditor textEditor) {
        super("Edit");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Undo"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //用戶想要復原
                        textEditor.getRecordController().restore(); 
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
                        textEditor.getTextArea().cut();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("copy"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textEditor.getTextArea().copy();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("paste"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textEditor.getTextArea().paste();
                    }
                }
            )
        );
        this.addToThis();
    }
}