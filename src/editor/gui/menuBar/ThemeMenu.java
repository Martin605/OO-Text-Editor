package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;
import editor.setting.ThemeEditor;
import editor.setting.theme.Light;
import editor.setting.theme.Dark;

public class ThemeMenu extends JMenu {

    ThemeEditor themeEditor;

    ThemeMenu() {
        super("Theme");
        ThemeEditor themeEditor = new ThemeEditor();
        JMenuItem lightMenuItem = new JMenuItem(
            new AbstractAction("Light"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    themeEditor.ChoiceTheme(new Light());
                }
            });
        JMenuItem darkMenuItem = new JMenuItem(
            new AbstractAction("Dark"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    themeEditor.ChoiceTheme(new Dark());
                }
            });
        this.add(lightMenuItem);
        this.add(darkMenuItem);
    }
}