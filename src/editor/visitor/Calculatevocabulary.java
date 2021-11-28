package editor.visitor;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import editor.TextEditor;

 
public class Calculatevocabulary implements Visitor {
	@Override
	public int visit(TextEditor textEditor) {
   	
        final Scanner scan = new Scanner(textEditor.getText());
        final String s = scan.nextLine();
        final Pattern pattern = Pattern.compile("([A-Za-z]+)");
        final Matcher matcher = pattern.matcher(s);
        final ArrayList<String> wordsList = new ArrayList<>();
        
        while (matcher.find()) {
            wordsList.add(matcher.group(1));
        }
        return wordsList.size();
    }
}