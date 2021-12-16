package editor.align;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import editor.TextEditor;

public class LeftAlign implements Align{//實作Align 對應ConcreteProduct
	private TextEditor textEditor;
	public LeftAlign(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void setAlign() {
		JTextPane textPane = new JTextPane();
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet left = new SimpleAttributeSet();
        StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);//設定文字靠左
        doc.setParagraphAttributes(0, 0, left, false);
        String text = textEditor.getText();
        textEditor.getTextArea().setStyledDocument(doc);//套用靠左
        textEditor.getTextArea().setText(text);//顯示文字
		
	}
}
