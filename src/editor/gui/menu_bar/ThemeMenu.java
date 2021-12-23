package editor.gui.menu_bar;

import java.awt.event.ActionEvent;

import javax.swing.*;

import editor.EditorGroup;
import editor.setting.theme.*;

//Abstract Factory 
public class ThemeMenu extends Menu {

    EditorGroup editorGroup;

    ThemeMenu() {
        super("Theme");
        EditorGroup editorGroup = EditorGroup.getEditorGroup();
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Light"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editorGroup.choiceTheme(new Light());
                        editorGroup.changeTheme();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Dark"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editorGroup.choiceTheme(new Dark());
                        editorGroup.changeTheme();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Light Gray"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editorGroup.choiceTheme(new LightGray());
                        editorGroup.changeTheme();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Dark Gray"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editorGroup.choiceTheme(new DarkGray());
                        editorGroup.changeTheme();
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("BlueDark"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editorGroup.choiceTheme(new BlueDark());
                        editorGroup.changeTheme();
                    }
                }
            )
        );

        this.addToThis();
    }
}