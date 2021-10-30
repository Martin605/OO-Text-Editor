package editor.search;

import java.util.ArrayList;
import java.util.Stack;

public class IteratorSearch {
	ArrayList<container> function = new ArrayList<container>();
	
	private Function f;
	int index;
	public Boolean hasNext() {
	
		if(index<function.size())
		{
			return true;
		}
			return false;
	}
	public Object next(){
		if(this.hasNext())
		{
			return function.get(index++);
		}
			return null;
	}

	public Object Search() {
		// TODO Auto-generated method stub
		return null;
	}
}
