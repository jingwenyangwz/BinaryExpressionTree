
public interface Visitor {
	//create an interface for the two operations in visitor
	public int visitOperation(Operation opt);
	public int visitNumber(Number num);
	
}
