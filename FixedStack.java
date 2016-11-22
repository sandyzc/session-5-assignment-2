package myPack;

public class FixedStack implements Stack{

	int I;
	
	public FixedStack(int I) {
		super();
		this.I = I;
	}

	@Override
	public void push(int I) {
		if(I>20){
			System.out.println("Stack overflow");
			
		}
		
	}

	@Override
	public int pop() {
		
		
		return 0;
	}


}
