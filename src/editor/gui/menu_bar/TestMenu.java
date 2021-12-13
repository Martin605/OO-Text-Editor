package editor.gui.menu_bar;

import java.awt.event.ActionEvent;
import javax.swing.*;

import editor.TextEditor;
import editor.file.FileAction;

public class TestMenu extends Menu {

    TestMenu(TextEditor textEditor) {
        super("Test");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Test Data"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FileAction().read(textEditor,"README.md");
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