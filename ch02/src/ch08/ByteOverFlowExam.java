package ch08;

public class ByteOverFlowExam {

	public static void main(String[] args) {
		
		// byte의 표현범위는 -128~127사이 를사이클링함.
		for(int i=-128; i<=1000; i++) {
			System.out.println(i+":"+(byte)i);
		}
	}
}
