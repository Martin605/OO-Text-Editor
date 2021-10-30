package editor.gui.menuBar;

import javax.swing.*;

import editor.EditorGroup;
import editor.TextEditor;
import editor.file.FileAction;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class FileMenu extends MenuItem {
    FileMenu(TextEditor textEditor) {
        super("File");

        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("New Window"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new EditorGroup().createEditor();
                    }
                }
            )
        );
        this.menuItem.add(  
            new JMenuItem(
                new AbstractAction("Open"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
			    		try {
                            new FileAction().open(textEditor);
                        } catch (IOException e1) {
                        }
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Save"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textEditor.getFileContollor().save();
                    }
                }
            )
        );
        this.menuItem.add(  
            new JMenuItem(
                new AbstractAction("Save As"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FileAction().save_as(textEditor);
                    }
                }
            )
        );
        this.addToThis();
    }
}