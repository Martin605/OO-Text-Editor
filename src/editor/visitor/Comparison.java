package editor.visitor;
public class Comparison implements editor.visitor.Visitor {

	@Override
	public int aVisitor(String p ){
		int b;
		b=p.length();
		return b;
	}



}