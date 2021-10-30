package editor.gui.frame;

import java.awt.BorderLayout;

import javax.swing.*;

import editor.TextEditor;

public class SearchFrame extends JFrame {

    private TextEditor te;

    public SearchFrame(TextEditor te) {
        super("Search");
        this.te = te;
        JTextField field = new JTextField(16);
        JButton button = new JButton();
        this.add(field, BorderLayout.CENTER);
        this.add(button, BorderLayout.LINE_END);
        this.setSize(100, 60);
        this.setResizable(false);
        this.setVisible(true);
    }

}
