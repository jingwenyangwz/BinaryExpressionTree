import java.util.ArrayList;
import java.util.List;

public class Operation implements Node{
	// the operation node could only be the parent node, it must have two child nodes
	private char operator;
	private Node left,right;
	
	public Operation(char opt) {
		this.operator = opt;
		this.left = null;
		this.right = null; 		
	}

	public char getOperator() {
		return operator;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void addNode(Node nod, String pick) {
		if (pick.equalsIgnoreCase("left")){
		left = nod;
		}
		else {
			right = nod;
		}
	}

	@Override
	public int Accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visitOperation(this);
	}
	
	
}
