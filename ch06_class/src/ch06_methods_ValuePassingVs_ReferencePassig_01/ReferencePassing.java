package ch06_methods_ValuePassingVs_ReferencePassig_01;

public class ReferencePassing {

	public static void main(String[] args) {
		// Circle 객체 생성
		Circle pizza = new Circle(10); // 오류 해결하려면  생성자에 Circle(int r) { radius = r;}을 만들어야함
		// 매개변수로 객체를 전달
		increase(pizza);  // increase 함수가 메소드 호출 
		//결과?
		System.out.println(pizza.radius); // 11

	}

	static void increase(Circle m) {
		m.radius++; // 11
	}
}
class Circle {
	//필드
	int radius;
	
	//생성자
	Circle(int r) {
		radius = r;
		
	}
	
}