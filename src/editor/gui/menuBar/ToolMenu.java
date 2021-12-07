package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.gui.frame.*;
import editor.sign.*;

import java.awt.event.ActionEvent;

public class ToolMenu extends MenuItem {
    ToolMenu(TextEditor textEditor) {
        super("Tool");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Preview (HTML)"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new PreviewFrame(textEditor);
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Text Counter"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new TextCounterFrame(textEditor);
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Vocabulary Counter"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new VocabularyCounterFrame(textEditor);
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Get File List"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FileListFrame(textEditor);
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new SampleSign(
                            textEditor, "鄭晨樺\n學生\n資訊管理系", 
                            new AddSignAtEnd());
                        ss.add();
                    }
                }
            )
        );
        this.addToThis();
    }
}