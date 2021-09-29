package ch01_If;

public class If01 {

	public static void main(String[] args) {
		
		int a= 2;
		if(a==1) {// 참이면 블럭 실행
			System.out.println("반갑다");
			System.out.println("나도 조건에 맞을 때만 실행되나.");
		}else { //거짓이면 블럭 실행
			System.out.println("대박");
		}
		System.out.println("프로그램 끝");

	}

}
