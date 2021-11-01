package editor.file;

import java.io.*;
import java.nio.file.*;
import java.awt.*;
import javax.swing.JFileChooser;

import editor.TextEditor;


//JAVA內建的工具，關於檔案儲存的程式碼
public class FileAction {

    private JFileChooser fileChooser = new JFileChooser();
    private int fileId;

    //將在Unsaved Class使用，
    //來確認檔案是否已經存在
    public boolean save(TextEditor textEditor) { 
        File file = new File(textEditor.getFileContollor().get_path()); 
        //File(內建的)可以用來讀取檔案或資料夾


        //如果檔案存在且檔案不是資料夾(避免出錯，路徑不是檔案)
        if(file.exists() && !file.isDirectory()) { 
            this.write(file, textEditor.getText()); 
            //將新的編輯內容儲存進檔案中

            return true;
            //並回傳True

        } else { //如果檔案不存在
            return this.save_as(textEditor);
            //用save_as()來儲存，回傳save_as()的值
        }
    }
    //將新的編輯內容檔案儲存成新檔案
    public boolean save_as(TextEditor textEditor) { 
        //設定出現的另存新檔的視窗標題
        fileChooser.setDialogTitle("Select a file that you want to save"); 
        
        //將另存新檔的視窗呈現出來，回傳要儲存的檔案位置到fileId
        fileId = fileChooser.showSaveDialog(textEditor);

        //如果fileId等於可行的動作
        if (fileId == JFileChooser.APPROVE_OPTION) { 
            //設定file為目前選擇的檔案
            File file = fileChooser.getSelectedFile();
            
            //如果可寫進檔案裡(取得目前編輯器中的內容寫入)
			if (this.write(file, textEditor.getText())) { 
                //讓FileCntroller知道儲存在哪裡，
                //把狀態改成已儲存
                textEditor.getFileContollor().setFileInfo(
                    textEditor, 
                    file.getName(), 
                    file.getAbsolutePath()
                );
                return true;
            }
        }
        //儲存失敗
        return false; 
    }

    //內建，將內容寫入檔案
    public boolean write(File file, String context) { 
        BufferedWriter writer;
		try {
			writer = new BufferedWriter(
                new FileWriter(file.getAbsolutePath())
            );
            writer.write(context);
            writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return true;
    }

    //開啟舊檔
    public void open(TextEditor textEditor) { 
        //設定出現的開啟舊檔的視窗標題
        fileChooser.setDialogTitle("Select a file that you want to open"); 
        //將開啟舊檔的視窗呈現出來，
        //回傳要儲存的檔案位置到fileId
        fileId = fileChooser.showOpenDialog(textEditor);
        
        //如果fileID等於可行的動作
        if (fileId == JFileChooser.APPROVE_OPTION) { 
            //設定file為目前選擇的檔案
            File file = fileChooser.getSelectedFile();
            
            //取得檔案路徑，讀取檔案裡的內容
            read(textEditor, file.getAbsolutePath());
        }

    }
    //讀取檔案
    public boolean read(TextEditor textEditor, String filePath) { 
        String content;
        
        try {
            //從檔案路徑找到檔案，
            //並讀取裡面內容，設定到content
            content = new String (Files.readAllBytes( Paths.get(filePath) ));
            
            //在編輯器中呈現讀取的內容(像是開啟舊檔)
            textEditor.getTextArea().setText(content);
            
            //利用getFileControllor()來取得目前檔案的controller
            //將目前所開啟的檔案路徑傳入setFileInfo()，來設定目前的檔案是已儲存的
            textEditor.getFileContollor().setFileInfo(textEditor,"",filePath);
            return true;
        } catch (IOException e) { //如果失敗
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
