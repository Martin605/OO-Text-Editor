package editor.gui.menu_bar;

import javax.swing.*;

import editor.TextEditor;
import editor.record.action.*;
import editor.record.command.*;

import java.awt.event.ActionEvent;

public class EditMenu extends Menu {

    private Inovker inovker = new Inovker();

    EditMenu(TextEditor textEditor) {
        super("Edit");
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Undo"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //用戶想要復原
                        Command undo = new Undo(new UndoAction(), textEditor); 
                        inovker.setCommand(undo);
                        inovker.run();
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
                        inovker.setCommand(redo);
                        inovker.run();
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
                           inovker.setCommand(insert);
                            inovker.run();
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