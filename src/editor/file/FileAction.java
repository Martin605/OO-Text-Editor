package editor.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JFileChooser;
import editor.TextEditor;

public class FileAction {

    JFileChooser fileChooser = new JFileChooser();
    int fileId;

    public void save(TextEditor textEditor) {
        File file = new File(textEditor.getFileContollor().get_path());
        if(file.exists() && !file.isDirectory()) { 
            this.write(file, textEditor.getText());
        } else {
            this.save_as(textEditor);
        }
    }

    public void save_as(TextEditor textEditor) {
        fileChooser.setDialogTitle("Select a file that you want to save"); 
        fileId = fileChooser.showSaveDialog(textEditor);
        if (fileId == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
			if (this.write(file, textEditor.getText())) {
                System.out.println("Save as file: " + file.getAbsolutePath());
                textEditor.getFileContollor().setFileInfo(textEditor, file.getName(), file.getAbsolutePath());
            }
        }
    }

    public boolean write(File file, String context) {
        BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
            writer.write(context);
            writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return true;
    }

    public void open(TextEditor textEditor) throws IOException {
        fileChooser.setDialogTitle("Select a file that you want to open"); 
        fileId = fileChooser.showOpenDialog(textEditor);

        if (fileId == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                String content = new String (Files.readAllBytes(Paths.get(file.getAbsolutePath())));
                textEditor.getTextArea().setText(content);
                System.out.println("open file: " + file.getAbsolutePath() + content);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
        }

    }
}
