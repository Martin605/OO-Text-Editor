package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.gui.frame.SearchFrame;

import java.awt.event.ActionEvent;

public class ToolMenu extends MenuItem {
    ToolMenu(TextEditor te) {
        super("Tool");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Get"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //
                    }
                }
            )
        );
        this.addToThis();
    }
}