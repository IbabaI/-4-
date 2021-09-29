package ch05_DoWhile;

public class DowhileSample01 {

	public static void main(String[] args) {
		
	char c = 'a';
		
		do {
			System.out.print(c);
			System.out.println(c+1);
			
			c = (char) (c + 1);
		//	System.out.println(c);
		} while (c <= 'z'); 	


	}

}
