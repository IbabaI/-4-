package ch05_DoWhile;

public class DoWhile04_01 {

	public static void main(String[] args) {
		
		int i=1, j=2;
		
		do {
			do {
				System.out.println(j + "*" + i + "=" +(i*j)+ "\t");
				j++;
				
			}while(j <=9);
			i++;
			j=2;
			System.out.println();
		}while(i<=9);

	}

}
