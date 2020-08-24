
public class Number implements Node{
	
	// the number node could only be the leaf node 
	private int value;
	
	public Number(int num) {
		this.value = num;
	}
	
	public int getNumber() {
		return value;
	}
	@Override
	public int Accept(Visitor visitor) {
	 return visitor.visitNumber(this);
		
	}
	
	
}
