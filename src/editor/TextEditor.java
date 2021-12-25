package editor;

import javax.swing.*;

import editor.record.*;
import editor.visitor.Visitor;
import editor.file.FileContollor;
import editor.gui.body.TextArea;
import editor.gui.frame.TextCounterFrame;
import editor.gui.frame.VocabularyCounterFrame;
import editor.gui.menu_bar.MenuBar;
import editor.visitor.Visitable;

import java.awt.*;
import java.awt.event.*;

//Observer Pattern
//擔任Concrete Observer角色
//Visitor pattern(Component class)
public class TextEditor extends Editor implements Visitable {
    //繼承Editor，再implement visitable interface

    private EditorGroup editorGroup = EditorGroup.getEditorGroup();
    private FileContollor fileContollor;
    private MenuBar menu_bar;
    private JTextPane text_area = new TextArea();
    private RecordController recordController;
    private TextCounterFrame textCounter;
    private VocabularyCounterFrame vocabularyCounter;

    public TextEditor() {
        super("OO Text Editor");
        editorGroup.addEditor(this);

        fileContollor = new FileContollor(this);
        menu_bar = new MenuBar(this);

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
    
    //Observer Pattern override Editor的方法
    @Override
    public void update_theme(Color background, Color foreground) {
        text_area.setBackground(background); //設定背景顏色
        text_area.setForeground(foreground); //設定字體顏色
        menu_bar.setTheme(background, foreground);
    }

    //Observer Pattern override Editor的方法
    @Override
    public void update_Font(Font font) {
    	text_area.setFont(font); //設定字體(粗體和斜體)
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

    public void set_title(String state) {
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

    public void runCount() {
        if (this.textCounter != null) {
            this.textCounter.run_count();
        }
        if (this.vocabularyCounter != null) {
            this.vocabularyCounter.run_count();
        }
    }

    public void setTextCounter(TextCounterFrame textCounterFrame) {
        if (this.textCounter != null) {
            this.textCounter.dispose();
        }
        this.textCounter = textCounterFrame;
    }

    public void setVocabularyCounter(VocabularyCounterFrame vocabularyCounterFrame) {
        if (this.vocabularyCounter != null) {
            this.vocabularyCounter.dispose();
        }
        this.vocabularyCounter = vocabularyCounterFrame;
    }

    //Visitor Pattern (implements Visitable interface)
    public int accept(Visitor visitor) { 
        return visitor.visit(this); 
    }
    //讓TextEditor接受Visitor，造訪他，並來回傳他自己

    //Prototype Pattern(client)
	public void openAsNewWindow(){
        //建立新TextEditor
		TextEditor a = new TextEditor(); 
        //設定原本text_area到新的視窗
		a.text_area.setText(text_area.getText());
        try {
            //複製recordController
            a.recordController = (RecordController) recordController.clone();
            a.recordController.set_TextEditor(a);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //設定空值
		a.textCounter=null;
        //設定空值
		a.vocabularyCounter=null;
	} 
}
