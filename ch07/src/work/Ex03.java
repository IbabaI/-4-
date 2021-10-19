package work;

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println("final 키워드에 대한 설명으로 틀린 것은?");
		
		System.out.println("​1) final 클래스는 부모 클래스로 사용할 수 있다.   -  x ");
		System.out.println("2) final 필드는 값이 저장된 후에는 변경할 수 없다.");
		System.out.println("3) final 메소드는 재정의(오버라이딩)할 수 없다.");
		System.out.println("4) static final필드는 상수를 말한다.");

		// 클래스를 선언할 때 final키워드를 class앞에 붙이게 되면 이 클래스는 최종적인 클래스는 최종적인 클래스이므로
		// 상속할 수 없는 클래스가 된다. 즉, final클래스는 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없다는 것이다.
	}  

}
class A extends Object{} //Object 의 자식 클래스
class V extends A{} // B클래스의 부모클래스

//final class AA extends Object{} // Object의 자식 클래스
//class BB extends AA{} //(다른)BB클래스의 부모클래스로 변환 불가