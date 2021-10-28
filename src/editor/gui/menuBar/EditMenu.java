package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.EditorGroup;
import java.awt.event.ActionEvent;

public class EditMenu extends JMenu {
    EditMenu(TextEditor te) {
        super("Edit");
        JMenuItem cutMenuItem = new JMenuItem(
            new AbstractAction("cut"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    te.getTextArea().cut();
                }
            }
        );
        JMenuItem copyMenuItem = new JMenuItem(
            new AbstractAction("copy"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    te.getTextArea().copy();
                }
            }
        );
        JMenuItem pasteMenuItem = new JMenuItem(
            new AbstractAction("paste"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    te.getTextArea().paste();
                }
            }
        );
        this.add(cutMenuItem);
        this.add(copyMenuItem);
        this.add(pasteMenuItem);
    }
}