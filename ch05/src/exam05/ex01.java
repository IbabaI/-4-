package exam05;

public class ex01 {

	public static void main(String[] args) {
		
		System.out.println("참조 타입에 대한 설명으로 틀린 것은 무엇입니까?");
		
		System.out.println("1.참조 타입에는 배열, 열거, 클래스, 인터페이스가 있다");
		System.out.println("2.참조 타입 변수의 메모리 생성 위치는 스택이다");
		System.out.println("3.참조 타입에서 ==, != 연산자는 객체 번지를 비교한다");
		System.out.println("4.참조 타입은 null값으로 초기화할 수 없다.  -  x");
		
		//참조타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로
		//null값을 가질 수 있다. null값도 초기값으로 사용할 수 있기 때문에
		//null로 초기화된 참조 변수는 스택영역에 생성된다.

	}

}
