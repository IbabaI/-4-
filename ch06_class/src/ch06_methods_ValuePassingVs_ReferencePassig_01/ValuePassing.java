package ch06_methods_ValuePassingVs_ReferencePassig_01;

public class ValuePassing {

	public static void main(String[] args) {
		
		int n =10;
		//매개변수값으로 기본타입 int 10의 값이 전달됨(복사)
		increase(n);
		
		System.out.println(n);

	}

	 static void increase(int m) {
		m=m+1;
		
	
		
	}

}
