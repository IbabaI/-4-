package work;

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("Tire 클래스를 상속받아 SnowTire 클래스를 다음과 같이 작성했습니다. \r\n"
				+ "SnowTireExample 클래스를 실행했을 때 출력 결과는 무엇일까요?");
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;   //promotion
		
		
		//오버라이딘된 메소드의 동적바인딩
		//메소드의 실행내용이 호출시점에 결정
		//자식클래스에서 재정의된 메소드는 부모타입으로 형 변환이 되어도 자식클래스에서 재정의된 메소드의 내용이 실행됨-다형성
		snowTire.run();
		tire.run();
	}
}
	 class Tire {
		public void run() {System.out.println("일반 타이어가 굴러갑니다."); }
	}


	

 class SnowTire extends Tire{
	@Override
	public void run() {System.out.println("스노우 타이어가 굴러갑니다."); }
}

/*1. 먼저 SnowTire 클래스 타입인 snowTire란 이름을 가진 객체를 생성한다.

2. 그 객체를 Tire 클래스 타입인  tire라는 객체에 할당한다.

3. 이 때 Tire은 SnowTire의 부모 클래스이기 때문에 자동 타입 변환이 일어난다.

4. 일반적으로 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다. 하지만 메소드가 자식 클래스에서 오버라이딩되었다면 자식 클래스의 메소드가 대신 호출된다.

5. 그렇기 때문에 SnowTire의 run 메소드가 두 번 실행되어 위와 같은 결과가 출력된다.
*/