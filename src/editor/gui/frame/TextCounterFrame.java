package editor.gui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

import editor.visitor.Comparison;
import editor.TextEditor;

public class TextCounterFrame extends Frame {

    private TextEditor te;

    public TextCounterFrame(TextEditor te) {
        super("Text Counter");
        this.te = te;
        int a = new Comparison().aVisitor(te.getText());
        JLabel context = new JLabel(String.valueOf(a));
        this.add(context, BorderLayout.CENTER);

        this.setSize(250, 80);
        this.setVisible(true);
    }

}
