package editor.gui.body;

import java.awt.Font;

import javax.swing.*;

public class TextArea extends JTextPane {

    public TextArea() {
        super();
        this.setFont(new Font("Dialog", Font.PLAIN , 16));
    }
}
