package work;

public class Ex08 {

	public static void main(String[] args) {
		
		System.out.println("A, B, C, D, E, F 클래스가 다음과 같이 상속 관계에 있을 때 다음 빈 칸에 들어올 수 없는 코드는?");
/*  B b = (        )

     메소드 선언 : void method(B b) {...}
     메소드 호출 : method(    )


A <- B <-D,E
↑
C
↑
F

*/
		
		//처음부터 부모객체를 만들어서 자식참조변수에 대입 불가.
		System.out.println("1) new B()");
		System.out.println("2) (B) new A() //강제 타입 변환  -  x ");
		System.out.println("3) new D()     //자동 타입 변환");
		System.out.println("4) new E()     // 자동 타입 변환");
		
		/*
		 * 이렇게 강제 타입 변환이 일어나려면 먼저 자식 타입이 부모 타입으로 자동 변환한 후, 
		 * 다시 자식 타입으로 변환할 때 강제 타입 변환을 사용할 수 있다. 
		 * 8번 문제에서는 자동 변환이 일어나기도 전에 강제 타입 변환을 하고 있으므로 성립될 수 없다. 
           강제 타입 변환은 자동 변환 이후에 자식 클래스의 필드나 메소드를 꼭 필요한 경우 사용하면 된다.

         */

	}

}
