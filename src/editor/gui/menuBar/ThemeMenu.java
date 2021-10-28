package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;

import editor.TextEditor;
import editor.setting.ThemeEditor;
import editor.setting.theme.Light;
import editor.setting.theme.Dark;

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
        this.addToThis();
    }
}