package editor.sign;

import javax.swing.JTextPane;

import editor.TextEditor;

// Bridge pattern (Concrete Implementor)
public class AddSignAtStart implements AddSignAPI {
    public void add(TextEditor te, String name) {
        JTextPane tp = te.getTextArea();
        tp.setText("Dear "+name+",\n"+tp.getText());
    }; 
}
