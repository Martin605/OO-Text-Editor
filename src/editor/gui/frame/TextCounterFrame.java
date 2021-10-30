package editor.gui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

import editor.visitor.*;
import editor.TextEditor;

public class TextCounterFrame extends Frame {

    private TextEditor te;
    JLabel context;

    public TextCounterFrame(TextEditor te) {
        super("Text Counter");
        this.te = te;

        Comparison a = new Comparison();
        		a.Visitor(te.getText());		
        JLabel context = new JLabel(String.valueOf(a.getSum()));
        this.add(context, BorderLayout.CENTER);

        this.setSize(250, 80);
        this.setVisible(true);
    }

    public void set_count(int count) {
        context.setText("目前字數 : "+Integer.toString(count));
    }

}
