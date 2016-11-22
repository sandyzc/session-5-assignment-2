package myPack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st;
		
		st= new FixedStack(0);
		System.out.println("Enter an integer Within 20");
		st.push(sc.nextInt());
		st.pop();
		
		st = new VariableStack(10);
		st.push(sc.nextInt());
	
		
}
}
