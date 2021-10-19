package work;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println("AnonymousExample 클래스의 실행 결과를 보고 Vehicle인터페이스의 익명 구현 객체를 이용해서 필드, 로컬 변수의\r\n"
				+ "초기값과 메소드의 매개값을 대입해보세요.");
		
		 Anonymous anony = new Anonymous();
		   anony.field.run();
		   anony.method1();
		   anony.method2(
		   new Vehicle() {
				   @Override
				   public void run() {
					   System.out.println("트럭이 달립니다.");
				   }

		   }
		  );

	}

}
