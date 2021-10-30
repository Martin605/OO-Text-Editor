package editor.visitor;
public class Comparison implements editor.visitor.Visitor {
	int sum =0;
	@Override
	public void Visitor(String p ){
		
		sum=p.length();
	}
	public int getSum() {
	return sum;
	}
}