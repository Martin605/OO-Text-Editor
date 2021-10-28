package editor;

import javax.swing.*;

import editor.gui.menuBar.MenuBar;
import editor.record.RecordController;
import editor.record.RecordListener;
import editor.file.FileContollor;
import editor.gui.body.TextArea;

import java.awt.*;

public class TextEditor extends JFrame {

    private JFrame frame;
    private JTextArea text_area;
    private FileContollor fileContollor;

    public TextEditor() {
        new EditorGroup().addWindow(this);
        frame = new JFrame("Editor");
        text_area = new TextArea();
        fileContollor = new FileContollor();
        JMenuBar menu_bar = new MenuBar(this);
        JScrollPane scroll_pane = new JScrollPane(
            text_area,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
        );  
        
        new RecordListener(this);
        //new RecordController(this);
        frame.setJMenuBar(menu_bar);
        frame.add(scroll_pane);
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

    public FileContollor getFileContollor() {
        return this.fileContollor;
    }

}
