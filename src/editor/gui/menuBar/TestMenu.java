package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;

import editor.TextEditor;
import editor.file.FileAction;

public class TestMenu extends MenuItem {

    TextEditor textEditor;
    TestMenu(TextEditor textEditor) {
        super("Test", textEditor);
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Test Data"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FileAction().read(textEditor,"src/Main.java");
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Get Test Data"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textEditor.getTextArea().setText("qwertyuio");
                    }
                }
            )
        );
        this.addToThis();
    }
}