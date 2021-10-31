package editor.file;

import java.io.*;
import java.nio.file.*;
import java.awt.*;
import javax.swing.JFileChooser;

import editor.TextEditor;

public class FileAction {

    JFileChooser fileChooser = new JFileChooser();
    int fileId;

    public boolean save(TextEditor textEditor) {
        File file = new File(textEditor.getFileContollor().get_path());
        if(file.exists() && !file.isDirectory()) { 
            this.write(file, textEditor.getText());
            return true;
        } else {
            return this.save_as(textEditor);
        }
    }

    public boolean save_as(TextEditor textEditor) {
        fileChooser.setDialogTitle("Select a file that you want to save"); 
        fileId = fileChooser.showSaveDialog(textEditor);
        if (fileId == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
			if (this.write(file, textEditor.getText())) {
                textEditor.getFileContollor().setFileInfo(textEditor, file.getName(), file.getAbsolutePath());
                return true;
            }
        }
        return false;
    }

    public boolean write(File file, String context) {
        BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
            writer.write(context);
            writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return true;
    }

    public void open(TextEditor textEditor) {
        fileChooser.setDialogTitle("Select a file that you want to open"); 
        fileId = fileChooser.showOpenDialog(textEditor);

        if (fileId == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            read(textEditor, file.getAbsolutePath());
        }

    }

    public boolean read(TextEditor textEditor, String filePath) {
        String content;
        try {
            content = new String (Files.readAllBytes( Paths.get(filePath) ));
            textEditor.getTextArea().setText(content);
            textEditor.getFileContollor().setFileInfo(textEditor,"",filePath);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static void openOutside(String path) {
            File file = new File(path);
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}
