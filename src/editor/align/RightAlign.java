package editor.align;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import editor.TextEditor;

public class RightAlign implements Align{//實作Align 對應ConcreteProduct
	private TextEditor textEditor;
	public RightAlign(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void setAlign() {
		JTextPane textPane = new JTextPane();
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);//設定文字靠右
        doc.setParagraphAttributes(0, 0, right, false);
        String text = textEditor.getText();
        textEditor.getTextArea().setStyledDocument(doc);//套用靠右
        textEditor.getTextArea().setText(text);//顯示文字
		
	}
}
