package editor.gui.body;

import java.awt.Font;

import javax.swing.*;

public class TextArea extends JTextArea {

    public TextArea() {
        super();
        this.setFont(new Font("Dialog", Font.PLAIN , 16));
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
    }
}
