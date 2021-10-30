package editor.gui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

import editor.TextEditor;

public class SearchFrame extends Frame {

    private TextEditor te;

    public SearchFrame(TextEditor te) {
        super("Search");
        this.te = te;
        
        JTextField field = new JTextField(16);
        JButton button = new JButton(
            new AbstractAction("search"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(field.getText());
                    System.out.println("55555555");
                    ///~~~~FOR search main function
                }
            }
        );
        
        this.add(field, BorderLayout.CENTER);
        this.add(button, BorderLayout.LINE_END);
        this.setSize(250, 80);
        this.setVisible(true);
    }

}
