package myPack;

public class VariableStack implements Stack{
	int I;
	
	public VariableStack(int i) {
		super();
		this.I = I;
	}

	@Override
	public void push(int I) {
		if(I>I){
			I=I;
			System.out.println("The new range of integers is "+I);
			
		}
		
		
	}

	@Override
	public int pop() {
		
		System.out.println(I);
		
		return I;
	}

}
