package editor.gui.menuBar;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import editor.TextEditor;
import editor.file.FileAction;
import editor.record.RecordCaretaker;
import editor.search.IteratorSearch;

public class Search extends MenuItem{
	TextEditor textEditor;
	IteratorSearch iterator = new IteratorSearch();
	Search(TextEditor textEditor) {
        super("Search", textEditor);
        this.menuItem.add(
            new JMenuItem(
                new AbstractAction("Search"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(textEditor.getText());
                    }
                }
            )
        );
        
        this.addToThis();
    }

	
	
}
