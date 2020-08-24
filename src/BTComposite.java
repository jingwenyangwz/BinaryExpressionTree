
public class BTComposite {

	public static void main(String [] arguments){     
		
		 Number no1 = new Number(3);
		 Number no2 = new Number(5);
		 Number no3 = new Number(6);
		 Operation plus = new Operation('+');
		 Operation multi = new Operation('*');
		 
		 String left = "left";
		 String right = "right";
		 plus.addNode(no1,left);
		 plus.addNode(multi,right);
		 multi.addNode(no2,left);
		 multi.addNode(no3,right);
		 
		 plus.Accept(new PrintVisitor());
		 plus.Accept(new EvaluateVisitor());
		 
		 
	 }
	
}
