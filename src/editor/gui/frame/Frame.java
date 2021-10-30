package editor.gui.frame;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
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

        JLabel title = new JLabel(name);
        title.setFont(new Font("Serif", Font.PLAIN, 18));
        this.add(title, BorderLayout.NORTH);
        
        this.setResizable(false);
    }


}
