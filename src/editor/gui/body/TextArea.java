package editor.gui.body;

import java.awt.Font;
import javax.swing.JTextArea;

public class TextArea extends JTextArea {

    public TextArea() {
        this.setFont(new Font("Dialog", Font.PLAIN , 16));
        this.setLineWrap(true);
    }

}
