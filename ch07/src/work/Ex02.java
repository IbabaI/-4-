package work;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("클래스 타입 변환에 대한 설명 중 틀린 것은 무엇입니까?​");
		
		System.out.println("1) 자식 객체는 부모 타입으로 자동 타입 변환된다.(promotion, upcasting)");
		System.out.println("2) 부모 객체는 자식 타입으로 강제 타입 변환이 항상 된다.    -   x ");//자식(cat) -> 부모(animal) -> 자식(cat), 부모가 바로 자식이 될 수는 없다.
		System.out.println("3) 자동 타입 변환을 이용해서 필드와 매개 변수의 다형성을 구현한다.");
		System.out.println("4) 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다.");

		// 자식 타입이 부모 타입으로 자동 변환한 후, 다시 자식 타입으로 변환할 때 강제 타입 변환을 사용할 수 있다. 
	}

}
