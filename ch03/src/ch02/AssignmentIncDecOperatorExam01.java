package ch02;

public class AssignmentIncDecOperatorExam01 {

	public static void main(String[] args) {
		
		//int타입 변수 선언 int타입이고 변수명이 다른 경우에는 , 로 나열해서 선언 가능
		int a=3, b=3, c=3; //명령문 1개이다.  같은 명령문 오른쪽은 명령문 3개 int a=3; int=b=3; int c=3;

				// 대입 연산자 사례
		a += 3; 		// a=a+3 = 6
		b *= 3; 		// b=b*3 = 9
		c %= 2; 		// c=c%2 = 1 c를 2로 나누고 나머지 값이 1
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
 // 전체가 문자열이 됨 : "a="+6 => "a="+"6" => "a=6", 
	            	// "a=6"+",b" =>  "a=6,b="+"9"  
	            	// =>"a=6,b=9"+",c="  => "a=6, b=9, c=1"
                    // "a=6, b=9,c=" +"1" => "a=6, b=9, c=1"		

		int d=3;
		// 증감 연산자 사례
		// ++, --가 변수 앞에 있으면 먼저 증/감 후 연산처리
		// ++, --가 변수 뒤에 있으면 연산처리 후 증/감
		a = d++; 	// a=3, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; 	// d=5, a=5
		System.out.println("a=" + a + ", d=" + d);
		a = d--; 		// a=5, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = --d; 		// d=3, a=3
		System.out.println("a=" + a + ", d=" + d);


	}

}
