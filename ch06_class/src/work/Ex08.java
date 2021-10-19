package work;

public class Ex08 {

	public static void main(String[] args) {
		
		System.out.println("인스턴스 멤버와 정적멤버에 대한 설명으로 틀린 것은");
		
		System.out.println("1)정적 멤버는 static으로 선언된 필드와 메소드를 말한다.");
		System.out.println("2)인스턴스 필드는 생성자 및 정적 블록에서 초기화될 수 있다   -  x");
		System.out.println("3)정적 필드와 정적 메소드를 객체 생성없이 클래스를 통해 접근할 수 있다.");
		System.out.println("4)인스턴스 필드와 메소드는 객체를 생성하고 사용해야한다.");
		
		//객체가 없어도 실행된다는 특징 때문에 정적 메소드와 정적 블록 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
		//또한 this 키워드도 사용이 불가능하다.

	}

}
