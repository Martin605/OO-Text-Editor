package editor.gui;

import javax.swing.*;

import editor.EditorGroup;
import editor.TextEditor;

import java.awt.event.ActionEvent;

public class FileMenu extends JMenu {
    FileMenu(TextEditor textEditor) {
        super("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem newWindowMenuItem = new JMenuItem(
            new AbstractAction("New Window"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    new EditorGroup().CreateEditor();
                }
            });
        JMenuItem openMenuItem = new JMenuItem(
            new AbstractAction("Open"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser chooser = new JFileChooser(".");
                    chooser.showOpenDialog(textEditor.getFrame());
                    // ....
                }
            });
        JMenuItem saveMenuItem = new JMenuItem("Save");
        this.add(newMenuItem);
        this.add(newWindowMenuItem);
        this.add(openMenuItem);
        this.add(saveMenuItem);
    }
}