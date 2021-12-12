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

        this.menuItem.add(new JMenuItem("====With Date===="));
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign with Sincerely"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new Sincerely(
                            textEditor,
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            true,
                            new AddSignAtEnd());
                        ss.addSignature();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign with Best Regard"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new BestRegards(
                            textEditor, 
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            true,
                            new AddSignAtEnd());
                        ss.addSignature();
                    }
                }
            )
        );
        this.menuItem.add(new JMenuItem("====Without Date===="));
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign with Sincerely"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new Sincerely(
                            textEditor,
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            false,
                            new AddSignAtEnd());
                        ss.addSignature();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sign with Best Regard"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new BestRegards(
                            textEditor, 
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            false,
                            new AddSignAtEnd());
                        ss.addSignature();
                    }
                }
            )
        );

        this.addToThis();
    }
}