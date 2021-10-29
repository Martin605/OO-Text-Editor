package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;

import editor.TextEditor;
import editor.file.FileAction;
import editor.record.RecordCaretaker;

public class TestMenu extends MenuItem {

    TextEditor textEditor;
    RecordCaretaker careTaker = new RecordCaretaker();
    TestMenu(TextEditor textEditor) {
        super("Undo", textEditor);
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Undo"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(textEditor.getText());
                    }
                }
            )
        );
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
                new AbstractAction("Test Data"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FileAction().read(textEditor,"src/Main.java");
                    }
                }
            )
        );
        this.addToThis();
    }
}