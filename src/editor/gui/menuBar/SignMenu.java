package editor.gui.menuBar;

import javax.swing.*;

import editor.EditorGroup;
import editor.TextEditor;
import editor.gui.frame.*;
import editor.sign.*;

import java.awt.event.ActionEvent;

//編輯器的Menu Bar，新增Sign(加簽名)按鈕
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
                            true, //加日期
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
                            true, //加日期
                            new AddSignAtEnd());
                        ss.addSignature();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sender"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new Sender(
                            textEditor,
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            true, //加日期
                            new AddSignAtStart());
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
                            false, //不加日期
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
                            false, //不加日期
                            new AddSignAtEnd());
                        ss.addSignature();
                    }
                }
            )
        );
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Add Sender"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Sign ss = new Sender(
                            textEditor,
                            EditorGroup.getEditorGroup().getSetting().get("oo.sign"), 
                            false, //不加日期
                            new AddSignAtStart());
                        ss.addSignature();
                    }
                }
            )
        );
        this.addToThis();
    }
}