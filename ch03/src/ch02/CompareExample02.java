package ch02;

public class CompareExample02 {

	public static void main(String[] args) {
		
		System.out.println(3<5);
		System.out.println(3>5);
		System.out.println(1<=0);
		System.out.println(10>=10);
		System.out.println(1==3);
		System.out.println(1!=3);
		
		System.out.println(!(3<5)); // F
		System.out.println((3<5)^(1==1));// T ^ T = F
		System.out.println((3>5)||(1==1));// F or T = T
		System.out.println((3<5)&&(1==1));// T and T = T

		

	}

}
