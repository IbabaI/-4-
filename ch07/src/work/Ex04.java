package work;

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("오버라이딩(Overriding)에 대한 설명으로 틀린 것은?");

		System.out.println("1) 부모 메소드의 시그너처(리턴 타입, 메소드명, 매개 변수)와 동일해야한다."); //오버라이딩 전제조건
		System.out.println("2) 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다(예: public(부모)->private(자식))");//범위
		System.out.println("3) @Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.");
		System.out.println("4) protected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의할 수 없다.   - x");
		
		//protected는 public과 default접근 제한의 중간쯤에 해당한다. 같은 패키지에서는 default와 같아 접근 제한이 
		//없지만 다른 패키지에서는 자식 클래스만 접근을 허용한다.

	}

}
