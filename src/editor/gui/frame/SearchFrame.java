package editor.gui.frame;

import java.awt.BorderLayout;

import javax.swing.*;

public class SearchFrame extends JFrame {
    SearchFrame() {
        JTextField field = new JTextField(10);
        this.add(field, BorderLayout.CENTER);
        this.setSize(900, 600);
        this.setVisible(true);
    }

}
