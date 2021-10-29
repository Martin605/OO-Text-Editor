package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;

import editor.TextEditor;
import editor.setting.ThemeEditor;
import editor.setting.theme.*;

public class ThemeMenu extends MenuItem {

    ThemeEditor themeEditor;

    ThemeMenu(TextEditor te) {
        super("Theme", te);
        ThemeEditor themeEditor = new ThemeEditor();
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Light"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        themeEditor.ChoiceTheme(new Light());
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Dark"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        themeEditor.ChoiceTheme(new Dark());
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Light Gray"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        themeEditor.ChoiceTheme(new LightGray());
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Dark Gray"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        themeEditor.ChoiceTheme(new DarkGray());
                    }
                }
            )
        );
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("BlueDark"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        themeEditor.ChoiceTheme(new BlueDark());
                    }
                }
            )
        );

        this.addToThis();
    }
}