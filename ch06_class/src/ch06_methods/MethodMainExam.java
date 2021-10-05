package ch06_methods;

public class MethodMainExam {

	public static void main(String[] args) {
		
		//메소드를 내장하고 있는 클래스의 객체 생성
		MethodExam m = new MethodExam();
		
		//참조변수의 메소드 접근
		//1.유형(매개변수0, 리턴타입0)
		//첫 번째 정수, 두 번째 정수를 받아서 연산 후 결과를 int타입으로 되돌려 줌
		int result=m.sum(10, 10); //호출시 실제값 매개변수로 전달
		System.out.println(result);
		// 리턴타입을 선언할 때 
//		int result =10+10; //10+10=20이라는 정수타입 결과 
//		int sum(10, 10)   return 10+10
		
		//2.유형(매개변수x, 리턴타입o)
		String str1=m.greeting();
		System.out.println(str1);
		
		//3.유형(매배견수o, 리턴타입x)
		m.sumVoid(10, 30);   //MethodExam에 3번 프린트ln에서출력
		
		//4.유형(매개변수x, 리턴타입x)
		m.greetingVoid();
		

	}

}
