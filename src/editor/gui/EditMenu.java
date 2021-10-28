package editor.gui;

import javax.swing.*;

public class EditMenu extends JMenu {
    EditMenu() {
        super("Edit");
        JMenuItem cutMenuItem = new JMenuItem("cut");
        JMenuItem copyMenuItem = new JMenuItem("copy");
        JMenuItem pasteMenuItem = new JMenuItem("paste");
        this.add(cutMenuItem);
        this.add(copyMenuItem);
        this.add(pasteMenuItem);
    }
}