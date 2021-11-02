package editor.gui.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

import editor.visitor.*;
import editor.TextEditor;

//Observer Pattern
//擔任Concrete Observer角色，繼承Frame
//計算文字總數的視窗
// Visitor pattern[Client]
public class TextCounterFrame extends Frame {

    private JLabel context = new JLabel("");
    private TextEditor te;
    private TextEditorVisitor teVisitor = new TextEditorVisitor();

    public TextCounterFrame(TextEditor te) {
        super("Text Counter");
        this.te = te;

        this.add(context, BorderLayout.CENTER);

        this.run_count();
        this.setSize(250, 100);
        this.setVisible(true);
        te.setTextCounter(this);
    }

    public void run_count() {
        this.set_count(te.accept(teVisitor));
    }

    public void set_count(int count) {
        this.context.setText("目前字數 : "+Integer.toString(count));
    }

    @Override
    public void update_theme(Color background, Color foreground) {
        super.update_theme(background, foreground);;
        this.context.setForeground(foreground);
    }

}
