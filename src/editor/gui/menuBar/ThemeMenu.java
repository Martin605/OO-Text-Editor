package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;
import editor.setting.ThemeEditor;
import editor.setting.theme.*;

public class ThemeMenu extends MenuItem {

    ThemeEditor themeEditor;

    ThemeMenu() {
        super("Theme");
        ThemeEditor themeEditor = new ThemeEditor();
        this.menuItem.add( 
            new JMenuItem(
                new AbstractAction("Light"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        themeEditor.ChoiceTheme(new Light());
                        themeEditor.change();
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
                        themeEditor.change();
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
                        themeEditor.change();
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
                        themeEditor.change();
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
                        themeEditor.change();
                    }
                }
            )
        );

        this.addToThis();
    }
}