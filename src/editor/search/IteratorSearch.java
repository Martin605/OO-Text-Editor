package editor.search;

import java.util.ArrayList;
import java.util.Stack;

import editor.search.Iteratorcontainer;

public class IteratorSearch {
	ArrayList<container> function = new ArrayList<container>();
	
	private Function f;
	int index;
	public Boolean hasNext(){
	
		if(index<function.length)
		{
			return true;
		}
			return false;
	}
	public Object next(){
		if(this.hasNext())
		{
			return function[index++];
		}
			return null;
	}

	public Object Search() {
		// TODO Auto-generated method stub
		return null;
	}
}
