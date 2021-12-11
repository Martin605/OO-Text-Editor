package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.file.FileAction;

import java.awt.event.ActionEvent;

public class FileMenu extends MenuItem {
    FileMenu(TextEditor textEditor) {
        super("File");

        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("New Window"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new TextEditor();
                    }
                }
            )
        );
        this.menuItem.add(  
            new JMenuItem(
                new AbstractAction("Open"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FileAction().open(textEditor);
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
        this.menuItem.add(  
                new JMenuItem(
                    new AbstractAction("Open As New Windo"){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        	try {
                        		TextEditor a = (TextEditor) textEditor.clone();//執行.clone()方法                       
                        	} catch(CloneNotSupportedException a) {
                        		a.printStackTrace();
                        	}
                        	
                        }
                    }
                )
            );
        this.addToThis();
    }
}