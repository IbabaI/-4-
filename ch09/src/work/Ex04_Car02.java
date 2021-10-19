package work;

//선생님 풀이

public class Ex04_Car02 {
	
/*다음과 같이 Car클래스 내부에 Tire와 Engine이 멤버 클래스로 선언되어 있습니다.
NestedClassExample에서 멤버 클래스의 객체를생성하는 코드를 작성해보세요.*/

public static void main(String[] args) {
	 //바깥 클래스 인스턴스 생성
	  Car myCar = new Car();
	  Car.Tire tire = myCar.new Tire();
	  //
	  Car.Engine engine = new Car.Engine();
	 
	}
}
	class Car{
	 class Tire{}//인스턴스
	 static class Engine{}//static
	}
