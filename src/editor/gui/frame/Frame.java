package editor.gui.frame;

import javax.swing.*;

import editor.Editor;

import java.awt.*;
import java.awt.event.*;

public class Frame extends Editor {

    JLabel title;

    Frame(String name) {
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
    }

    @Override
    public void update_theme(Color background, Color foreground) {
        this.getContentPane().setBackground(background);
        this.title.setForeground(foreground);
    }

    @Override
    public void update_Font(Font font) {
        this.title.setFont(font);
    }


}
