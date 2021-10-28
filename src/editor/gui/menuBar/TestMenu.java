package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;

import editor.TextEditor;

public class TestMenu extends JMenu {

    TextEditor textEditor;
    RecordCaretaker careTaker = new RecordCaretaker();
    TestMenu(TextEditor textEditor) {
        super("Undo");
        JMenuItem lightMenuItem = new JMenuItem(
            new AbstractAction("Undo"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(textEditor.getText());
                }
            });
        this.add(lightMenuItem);
    }
}