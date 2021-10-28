package editor.gui.menuBar;

import java.awt.event.ActionEvent;
import javax.swing.*;
import editor.TextEditor;

public class CloseMenu extends JMenu {

    CloseMenu(TextEditor te) {
        super(
            new AbstractAction("Close"){
                @Override
                public void actionPerformed(ActionEvent e) {
                    // te.close();
                }
            }
        );
    }
}