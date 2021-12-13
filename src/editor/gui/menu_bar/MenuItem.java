package editor.gui.menu_bar;

import javax.swing.AbstractAction;
import javax.swing.JMenuItem;

import editor.gui.color_component.ColorComponent;
import editor.gui.color_component.theme_factory.ThemeFactory;

public class MenuItem extends JMenuItem {

    MenuItem(String a) {
        super(a);
    }

    MenuItem(AbstractAction a) {
        super(a);
    }

    public void setTheme(ThemeFactory themeFactory) {
        ColorComponent backgroundColor = themeFactory.createBackgroundColor();
        ColorComponent foregroundColor = themeFactory.createForegroundColor();
        this.setBackground(backgroundColor.getColor());
        this.setForeground(foregroundColor.getColor());
    }
}
