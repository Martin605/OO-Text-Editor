package editor;

import javax.swing.*;

import editor.gui.menuBar.MenuBar;
import editor.record.RecordController;
import editor.record.RecordListener;
import editor.file.FileContollor;
import editor.gui.body.TextArea;

import java.awt.*;
import java.awt.event.WindowListener;

public class TextEditor extends JFrame {

    private JFrame frame = new JFrame("Editor");
    private JPanel panel = new JPanel();
    private JTextArea text_area = new TextArea();
    private FileContollor fileContollor = new FileContollor();
    private EditorGroup editorGroup = new EditorGroup();

    public TextEditor() {
        editorGroup.addEditor(this);
        fileContollor.setFileInfo(this, "", "");
        JMenuBar menu_bar = new MenuBar(this);
        JScrollPane scroll_pane = new JScrollPane(
            panel,
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
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(frame, 
                    "Are you sure you want to close this editor?", "==Close Editor==", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                        windowEvent.getWindow().dispose();;
                } else {

                }
            }
        });
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

    @Override
    public void dispose() {
        editorGroup.removeEditor(this);
        super.dispose();
    }

}
