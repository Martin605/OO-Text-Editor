package editor.search;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class container implements Interfacecontainer{
		List<Function> f = new ArrayList<>();

		public void data(){
	        f.add(new Function("public"));
	    }
		public Iterator CreateIterator(){
	        return (Iterator) new container();
	    }

	}

