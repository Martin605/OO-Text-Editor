package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.file.fileList.iterator.FLList;
import editor.gui.frame.*;

import java.awt.event.ActionEvent;
import java.io.File;

public class ToolMenu extends MenuItem {
    ToolMenu(TextEditor te) {
        super("Tool");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Run"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        te.getFileContollor().run();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Preview"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new PreviewFrame(te);
                    }
                }
            )
        );
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
                new AbstractAction("Get File List"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FileListFrame(te);
                    }
                }
            )
        );
        this.addToThis();
    }
}