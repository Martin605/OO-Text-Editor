package editor;

import javax.swing.*;

import editor.visitor.Visitor;
import editor.gui.menuBar.MenuBar;
import editor.record.*;
import editor.file.FileContollor;
import editor.gui.body.TextArea;

import java.awt.*;
import java.awt.event.*;

public class TextEditor extends Editor {

    private EditorGroup editorGroup = EditorGroup.getEditorGroup();
    private FileContollor fileContollor;
    private JTextPane text_area = new TextArea();
    private RecordController recordController;

    public TextEditor() {
        super("OO Text Editor");
        editorGroup.addEditor(this);

        fileContollor = new FileContollor(this);
        JMenuBar menu_bar = new MenuBar(this);

        new RecordListener(this);
        recordController = new RecordController(this);
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
                    "Are you want to save it before close this editor?", 
                    "SAVE FILE???", 
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );
                if ( jop == JOptionPane.YES_OPTION){
                    fileContollor.close();
                } else if ( jop == JOptionPane.NO_OPTION){
                    dispose();
                }
            }
        });
        this.setSize(900, 600);
        this.setVisible(true);

    }
    
    @Override
    public void update_theme(Color background, Color foreground) {
        text_area.setBackground(background);
        text_area.setForeground(foreground);
    }

    @Override
    public void update_Font(Font font) {
    	text_area.setFont(font);
    }

    public String getText() {
        return this.text_area.getText();
    }

    public JTextPane getTextArea() {
        return this.text_area;
    }

    public RecordController getRecordController() {
        return this.recordController;
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

    public void showMsg(String title, String msg) {
        JOptionPane.showConfirmDialog(
            null, 
            msg, 
            title, 
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
    }
  
}
