package editor;

import javax.swing.*;

import editor.gui.menuBar.MenuBar;
import editor.record.RecordController;
import editor.record.RecordListener;
import editor.file.FileContollor;
import editor.gui.body.TextArea;

import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {

    private EditorGroup editorGroup = new EditorGroup();
    private FileContollor fileContollor;
    private JTextArea text_area = new TextArea();
    // private JScrollPane scroll_pane = new JScrollPane(text_area);

    public TextEditor() {
        super("OO Text Editor");
        editorGroup.addEditor(this);

        fileContollor = new FileContollor(this);
        JMenuBar menu_bar = new MenuBar(this);

        new RecordListener(this);
        //new RecordController(this);
        
        // add scroll
        JScrollPane scrollPane = new JScrollPane(
            text_area, 
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );
        
        // add(panel);
        add(scrollPane, BorderLayout.CENTER);
        setJMenuBar(menu_bar);
        
        // Windows close action
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                Integer jop = JOptionPane.showConfirmDialog(
                    null, 
                    "Are you sure you want to close this editor?", 
                    "==Close Editor==", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );
                if ( jop == JOptionPane.YES_OPTION){
                    fileContollor.close();
                }
            }
        });
        this.setSize(900, 600);
        this.setVisible(true);

    }

    public void setTheme(Color background, Color foreground) {
        text_area.setBackground(background);
        text_area.setForeground(foreground);
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

    public void setState(String state) {
        this.setTitle(state + " OO Text Editor ");
    }

}
