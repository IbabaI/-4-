package ch04_array;

public class Exam02_01 {

	public static void main(String[] args) {
		
		//기본타입 값 비교
		int a = 10;
		int b = 10;
		System.out.println(a==b?"정수타입 변수 a와 정수타입 변수 b의 값이 같습니다.":"정수타입 변수 a와 정수타입 변수 b의 값이 같습니다.");
		System.out.println(a!=b?"정수타입 변수 a와 정수타입 변수 b의 값이 다릅니다.":"정수타입 변수 a와 정수타입 변수 b의 값이 다르지 않습니다.");
	
       // 참조타입 값 비교
		
		String str1= new String("hello");
		String str2= new String("hello");
		System.out.println(str1==str2?"str1의 내용과 str2의 내용이 같습니다.":"str1의 내용과 str2의 내용이 다릅니다.");
		// == 연산자는 객체가 같다는 의미인데 내용이 같다고 하는것은 틀린 표현, 
		// 사용하려면 str1이 참조하는 주소와 str2이 참조하는 주소가 같습니다.":"str1이 참조하는 주소와 str2이 참조하는 주소가 다릅니다.");
		
		System.out.println(str1.equals(str2)?"str1의 내용과 str2의 내용이 논리적으롣 동등합니다."
				                             :"str2의 내용과 str2의 내용이 논리적으로 동등하지 않습니다.");
		
		
	}
	

}
