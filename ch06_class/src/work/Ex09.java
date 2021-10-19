package work;

public class Ex09 {

	public static void main(String[] args) {
		
		System.out.println("final필드와 상수(static final)에 대한 설명으로 틀린것은");
		
		System.out.println("1)final필드와 상수는 초기값이 저장되면 값을 변경할 수 없다.");
		System.out.println("2)final필드와 상수는 생성자에서 초기화될 수 있다.   -  x");
		System.out.println("3)상수의 이름은 대문자로 작성하는 것이 관례이다.");
		System.out.println("4)상수는 객체 생성없이 클래스를 통해 사용할 수 있다.");
		
		//final필드는 객체마다 저장되고, 생성자의 매개값을 통해서 여러가지 값을 가질 수 있다.
		//static final필드는 객체마다 저장되지 않고, 클래스에만 포함된다. 그리고 한 번 초기값이 저장되면 변경할 수 없다.

	}

}
