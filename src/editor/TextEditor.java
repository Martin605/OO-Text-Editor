package editor;

import javax.swing.*;

import editor.gui.menuBar.MenuBar;
import editor.gui.body.TextArea;

import java.awt.*;

public class TextEditor extends JFrame {

    private JFrame frame;
    private JTextArea text_area;

    public TextEditor() {
        new EditorGroup().addWindow(this);
        frame = new JFrame("Editor");
        text_area = new TextArea();
        Container contentPane = getContentPane();
        JMenuBar menu_bar = new MenuBar(this);
        JScrollPane scroll_pane = new JScrollPane(
            text_area,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
        );  

        frame.setJMenuBar(menu_bar);
        contentPane.add(scroll_pane,BorderLayout.CENTER);
        frame.add(text_area);
        frame.setSize(900, 600);
        frame.setVisible(true);
    }

    public void setTheme(Color background, Color foreground) {
        text_area.setBackground(background);
        text_area.setForeground(foreground);
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public String getText() {
        return this.text_area.getText();
    }

    public JTextArea getTextArea() {
        return this.text_area;
    }

}