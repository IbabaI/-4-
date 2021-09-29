package ch01;

public class DenyLogicOperatorExamle02 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		--x;
		System.out.println(x);  // 9
		
		--x;
		System.out.println(x); // 8
		
		int z = --x;  // z=7 , x =7
		
		System.out.println(z); //7
		System.out.println(x);  // 7
		
	
		
		x--;
		System.out.println(x);  //5
		
		x--;
		System.out.println(x);  //4

	}

}
