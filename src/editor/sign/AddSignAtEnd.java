package editor.sign;

import javax.swing.JTextPane;

import editor.TextEditor;

// Bridge pattern (Concrete Implementor)
// add Sign at end of file
public class AddSignAtEnd implements AddSignAPI {

    // add Sign
    public void add(TextEditor te, String name) {
        // get editor edit area
        JTextPane tp = te.getTextArea();
        // set text at edit area
        tp.setText(tp.getText()+"\n"+name);
    }; 
    
}
