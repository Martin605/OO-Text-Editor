package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;

import editor.TextEditor;

public class TestMenu extends JMenu {

    TextEditor textEditor;

    TestMenu(TextEditor textEditor) {
        super("Test");
        JMenuItem lightMenuItem = new JMenuItem(
            new AbstractAction("Test"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(textEditor.getText());
                }
            });
        this.add(lightMenuItem);
    }
}