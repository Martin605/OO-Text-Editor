package editor.gui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

import editor.TextEditor;
import editor.search.Search;

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

                    ///~~~~FOR search main function
                    Search.search(te.getText(), field.getText());
                }
            }
        );
        
        this.add(field, BorderLayout.CENTER);
        this.add(button, BorderLayout.LINE_END);
        this.setSize(250, 80);
        this.setVisible(true);
    }

    

}
