package ch02;

public class CompareExample {

	public static void main(String[] args) {
		
		int age = 25;
		if((age >=20)&&(age<30)) {
			System.out.println("20대");
		}
		char c = 'x'; //'x' =>ASCII코드값 비교
		
		if((c>='A')&&(c<='Z')) {
			System.out.println("영문대문자");
		}
		
		int x = 50;
		int y = 25;
		if((x>=0)&&(y>=0)&&(x<=50)&&(y<=50)) {
			System.out.println("영역내에 있는 좌표");
		}

	}

}
