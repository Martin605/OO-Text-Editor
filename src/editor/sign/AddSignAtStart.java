package editor.sign;

import javax.swing.JTextPane;

import editor.TextEditor;

// Bridge pattern (Concrete Implementor)
// add Sign at start of file
public class AddSignAtStart implements AddSignAPI {
    // add Sign
    public void add(TextEditor te, String name) {
        // get editor edit area
        JTextPane tp = te.getTextArea();
        // set text at edit area
        tp.setText("Dear "+name+",\n"+tp.getText());
    }; 
}
