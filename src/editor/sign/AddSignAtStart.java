package editor.sign;

import javax.swing.JTextPane;

import editor.TextEditor;

// Bridge pattern (Concrete Implementor)
//新增簽名在文件的頭端
public class AddSignAtStart implements AddSignAPI {
    // 新增簽名
    public void add(TextEditor te, String name) {
         // 取得編輯器的編輯範圍
        JTextPane tp = te.getTextArea();
        // 設至文字在編輯範圍
        tp.setText(name+"\n"+tp.getText());
    }; 
}
