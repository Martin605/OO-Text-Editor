package editor.gui.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

import editor.visitor.*;
import editor.TextEditor;

//Observer Pattern，同時也有Visitor Pattern
//擔任Concrete Observer角色，繼承Frame
//計算文字總數的視窗
// Visitor pattern[Client]
public class VocabularyCounterFrame extends Frame {

    private JLabel context = new JLabel("");
    private TextEditor te;

    //在此實行Visitor Pattern
    private Calculatevocabulary teVisitor = new Calculatevocabulary();

    public VocabularyCounterFrame(TextEditor te) {
        super("Vocabulary Counter");
        this.te = te;

        this.add(context, BorderLayout.CENTER);

        this.run_count();
        this.setSize(250, 100);
        this.setVisible(true);
        te.setVocabularyCounter(this);
    }

    public void run_count() {
        this.set_count(te.accept(teVisitor));
        //使用TextEditor的accept()，來接受TextEditorVisitor來造訪TextEditor
    }

    public void set_count(int count) {
        this.context.setText("目前英文字數 : "+Integer.toString(count));
    }

    @Override
    public void update_theme(Color background, Color foreground) {
        super.update_theme(background, foreground);;
        this.context.setForeground(foreground);
    }

}
