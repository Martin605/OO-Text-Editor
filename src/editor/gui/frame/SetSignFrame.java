package editor.gui.frame;

import javax.swing.*;

import editor.EditorGroup;

import java.awt.*;
import java.awt.event.ActionEvent;

public class SetSignFrame extends Frame {
    
    private JTextField context = new JTextField(EditorGroup.getEditorGroup().getSetting().get("oo.sign"));

    public SetSignFrame() {
        super("Set Sign");

        JScrollPane scrollPane = new JScrollPane(context);
        JButton btn = new JButton(new AbstractAction("Set"){
            @Override
            public void actionPerformed(ActionEvent e) {
                EditorGroup.getEditorGroup().getSetting().set("oo.sign",context.getText());
                dispose();
            }
        });
        this.add(btn,BorderLayout.SOUTH);
        this.add(scrollPane, BorderLayout.CENTER);
        this.setSize(200, 130);
        this.setResizable(true);
        this.setVisible(true);
    }

    @Override
    public void update_theme(Color background, Color foreground) {
        super.update_theme(background, foreground);;
        this.context.setForeground(foreground);
    }

}
