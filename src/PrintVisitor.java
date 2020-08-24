
public class PrintVisitor implements Visitor{



	@Override
	public int visitNumber(Number num) {
		System.out.println(" " + num.getNumber() + " ");
		return 0;
	}

	@Override
	public int visitOperation(Operation opt) {
		//inOrder traverse		
		if (opt.getLeft() != null) {
			opt.getLeft().Accept(this);
			System.out.println(" " + opt.getOperator() + " ");
			if(opt.getRight() != null) {
			opt.getRight().Accept(this);
			}
		}
		return 0;	
	}

}
