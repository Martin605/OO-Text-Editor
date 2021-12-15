package editor.record.action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;

import editor.TextEditor;

public class InsertAction implements RecordAction{
	private JFileChooser fileChooser = new JFileChooser();//����ɮת�����
    private int fileId;
           

	@Override
	public void action(TextEditor textEditor) {
		String content;
		File file;
		fileChooser.setDialogTitle("Select a file that you want to Insert"); //�]�w�������D
	    
	    fileId = fileChooser.showOpenDialog(textEditor);	    
	    
	    if (fileId == JFileChooser.APPROVE_OPTION) { 	        
	        file = fileChooser.getSelectedFile();  
	        try {
				content = new String (Files.readAllBytes( Paths.get(file.getAbsolutePath()) ));
				//���o���e
				try {
					int len = textEditor.getTextArea().getText().length();//���o��������
					int Elen = textEditor.getTextArea().getText(0, textEditor.getTextArea().getCaretPosition()).length();//���o���J�I�e������
					int Alen = len-Elen-1;//���o���J�I�᪺����
					String OContent = textEditor.getTextArea().getText(0, textEditor.getTextArea().getCaretPosition());//���o���J�I�e�����e
					String EContent =textEditor.getTextArea().getText(textEditor.getTextArea().getCaretPosition(),Alen);//���o���J�I�᪺���e
					textEditor.getTextArea().setText(OContent + content+EContent);//�N�Ҧ���r���
				
				} catch (BadLocationException e) {
					
					e.printStackTrace();
				}
	        
	        } catch (IOException e) {
				e.printStackTrace();
			}
	}	
	    
	    
	    
		
	}
}