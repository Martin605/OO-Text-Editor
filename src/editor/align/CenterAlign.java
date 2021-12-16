package editor.align;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import editor.TextEditor;

public class CenterAlign implements Align{ //實作Align 對應ConcreteProduct
	private TextEditor textEditor;
	public CenterAlign(TextEditor textEditor) {
		this.textEditor = textEditor;
	}

	@Override
	public void setAlign() {
		JTextPane textPane = new JTextPane();
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER); //設定文字置中
        doc.setParagraphAttributes(0, 0, center, false);
        String text = textEditor.getText();
        textEditor.getTextArea().setStyledDocument(doc); //套用置中
        textEditor.getTextArea().setText(text);//顯示文字
		
	}

}
