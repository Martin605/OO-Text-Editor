package editor.gui.frame;

import javax.swing.*;

import java.awt.*;
import java.io.File;

import editor.TextEditor;
import editor.file.fileList.iterator.FLList;

public class FileListFrame extends Frame {

    private JTextArea context = new JTextArea("");

    public FileListFrame(TextEditor te) {
        super("File List", te);
        context.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(context);
        this.add(scrollPane, BorderLayout.CENTER);
        this.run();
        this.setSize(250, 300);
        this.setResizable(true);
        this.setVisible(true);
    }

    public void run() {
        this.set_text(
            FLList.getList(
                new File(
                    this.textEditor.getFileContollor().get_path()
                ).getParent()
            )
        );
    }

    public void set_text(String text) {
        this.context.setText(text);
    }

    @Override
    public void update_theme(Color background, Color foreground) {
        super.update_theme(background, foreground);;
        this.context.setForeground(foreground);
    }

}
