package editor.gui.menuBar;

import javax.swing.*;

import editor.TextEditor;
import editor.record.action.*;
import editor.record.command.*;

import java.awt.event.ActionEvent;

//Command Pattern
//擔任 Command Pattern 的 Inovker 角色
public class EditMenu extends MenuItem {
    EditMenu(TextEditor textEditor) {
        super("Edit");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Undo"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //用戶想要復原
                        Command undo = new Undo(new UndoAction(), textEditor); 
                        undo.action();
                    }
                }
            )
        );
        //建立Redo按鈕
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Redo"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 用戶想要Redo
                        Command redo = new Redo(new RedoAction(), textEditor); 
                        redo.action();
                    }
                }
            )
        );
        this.menuItem.add(
                new JMenuItem(
                    new AbstractAction("Insert"){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                        	//執行insert
                           Command insert= new Insert(new InsertAction(), textEditor); 
                           insert.action();
                        }
                    }
                )
            );
        this.menuItem.add(new JMenuItem("========"));
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("cut"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textEditor.getTextArea().cut();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("copy"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textEditor.getTextArea().copy();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("paste"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textEditor.getTextArea().paste();
                    }
                }
            )
        );
        
        this.addToThis();
    }
}