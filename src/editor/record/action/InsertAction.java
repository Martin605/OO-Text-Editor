package editor.record.action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;

import editor.TextEditor;

public class InsertAction implements RecordAction{
	private JFileChooser fileChooser = new JFileChooser();//選擇檔案的視窗
    private int fileId;
           

	@Override
	public void action(TextEditor textEditor) {
		String content;
		String original_content;
		File file;
		fileChooser.setDialogTitle("Select a file that you want to Insert"); //設定視窗標題
	    
	    fileId = fileChooser.showOpenDialog(textEditor);	    
	    
	    if (fileId == JFileChooser.APPROVE_OPTION) { 	        
	        file = fileChooser.getSelectedFile();  
	        try {
				content = new String (Files.readAllBytes( Paths.get(file.getAbsolutePath()) ));
				original_content = textEditor.getTextArea().getText();
				//取得內容
				try {
					int len = textEditor.getTextArea().getText().length();//取得全部長度
					int position = textEditor.getTextArea().getCaretPosition();//取得插入點前的長度
					// int lenacp = len-Elen; //取得插入點後的長度
					if(len!=0){
						String OContent = original_content.substring(0, position);//取得插入點前的內容
						String EContent = original_content.substring(position, len);//取得插入點後的內容
						textEditor.getTextArea().setText(OContent+content+EContent);//將所有文字顯示
						textEditor.getTextArea().setCaretPosition(position+content.length());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
	        
	        } catch (IOException e) {
				e.printStackTrace();
			}
	}	
	    
	    
	    
		
	}
}