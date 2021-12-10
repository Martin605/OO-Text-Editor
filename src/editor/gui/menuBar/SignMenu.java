package editor.gui.menuBar;

import javax.swing.*;

import editor.EditorGroup;
import editor.TextEditor;
import editor.gui.frame.*;
import editor.sign.*;

import java.awt.event.ActionEvent;

public class SignMenu extends MenuItem {
    SignMenu(TextEditor textEditor) {
        super("Sign");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Set Sign"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new SetSignFrame();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign At Start"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new SampleSign(
                            textEditor, 
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            new AddSignAtStart());
                        ss.add();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign At End"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new SampleSign(
                            textEditor, 
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            new AddSignAtEnd());
                        ss.add();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign At Start with Date"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new SignWithDate(
                            textEditor, 
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            new AddSignAtStart());
                        ss.add();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign At End with Date"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new SignWithDate(
                            textEditor, 
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            new AddSignAtEnd());
                        ss.add();
                    }
                }
            )
        );
        this.addToThis();
    }
}