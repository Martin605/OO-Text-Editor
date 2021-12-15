package editor.record.command;

import editor.TextEditor;
import editor.record.action.RecordAction;

public class Insert extends Command{
		//繼承commend的執行插入的命令
		public Insert(RecordAction recordAction,TextEditor textEditor) {
			super(recordAction,textEditor);
			
		}
}
