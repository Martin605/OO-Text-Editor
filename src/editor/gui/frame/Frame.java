package editor.gui.frame;

import editor.Editor;
import editor.TextEditor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Observer Pattern
//擔任Concrete Observer角色
//小視窗模板
public class Frame extends Editor {

    private JLabel title;
    protected TextEditor textEditor;

    Frame(String name, TextEditor textEditor) {
        super(name);

        // Windows close action
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
            }
        });

        title = new JLabel(name);
        title.setFont(new Font("Serif", Font.PLAIN, 18));
        this.add(title, BorderLayout.NORTH);
        
        this.setResizable(false);
        this.textEditor = textEditor;
    }

    //Observer Pattern override Editor的方法
    @Override
    public void update_theme(Color background, Color foreground) {
        this.getContentPane().setBackground(background);
        this.title.setForeground(foreground);
    }

    //Observer Pattern override Editor的方法
    @Override
    public void update_Font(Font font) {
        this.title.setFont(font);
    }
    
}
