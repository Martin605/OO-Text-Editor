package editor;

import javax.swing.*;
import java.awt.*;
import editor.gui.MenuBar;

public class TextEditor extends JFrame {

    private JFrame frame;
    private JTextArea text_area;

    TextEditor() {
        frame = new JFrame("Editor");
        text_area = new JTextArea();
        JMenuBar menu_bar = MenuBar.init(this);
        frame.setJMenuBar(menu_bar);
        frame.add(text_area);
        frame.setSize(900, 600);
        frame.show();
    }

    public void setTheme(Color background, Color foreground) {
        text_area.setBackground(background);
        text_area.setForeground(foreground);
    }

    public JFrame getFrame() {
        return this.frame;
    }

}
