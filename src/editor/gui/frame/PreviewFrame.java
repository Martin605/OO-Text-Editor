package editor.gui.frame;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

import editor.TextEditor;

//Observer Pattern
//擔任Concrete Observer角色，繼承Frame
//跑HTML的視窗
public class PreviewFrame extends Frame {

    public PreviewFrame(TextEditor te) {
        super("Preview", te);
        
        JEditorPane jEditorPane = new JEditorPane();
        HTMLEditorKit kit = new HTMLEditorKit();
        Document doc = kit.createDefaultDocument();
        JScrollPane scrollPane = new JScrollPane(jEditorPane);

        jEditorPane.setEditorKit(kit);
        jEditorPane.setDocument(doc);
        jEditorPane.setText(te.getText());
        jEditorPane.setEditable(false);

        this.getContentPane().add(scrollPane, BorderLayout.CENTER);

        this.setSize(500, 500);
        this.setResizable(true);
        this.setVisible(true);
    }

}
