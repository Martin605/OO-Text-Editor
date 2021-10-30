package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.classList.iterator.CList;
import editor.gui.frame.TextCounterFrame;

import java.awt.event.ActionEvent;

public class ToolMenu extends MenuItem {
    ToolMenu(TextEditor te) {
        super("Tool");
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Text Counter"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new TextCounterFrame(te);
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Get Lsit"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CList.getList(te.getText());
                    }
                }
            )
        );
        this.addToThis();
    }
}