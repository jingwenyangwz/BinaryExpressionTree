
public class EvaluateVisitor implements Visitor{


	
	@Override
	public int visitNumber(Number num) {
		return num.getNumber();
	}
	
	@Override
	public int visitOperation(Operation opt) {
		//preOrder traverse
		int a = 0,b = 0,c = 0;
		if (opt.getLeft() != null) {
			a = opt.getLeft().Accept(this);
		}
		if(opt.getRight() != null) {
			b = opt.getRight().Accept(this);	
		}
		if (opt.getOperator() == '+'){
			c = a+b;
		}
		else if(opt.getOperator() == '*'){
			c = a*b;
		}
		System.out.println("the output for this step is :" + c);
		return c;
		
	}

}