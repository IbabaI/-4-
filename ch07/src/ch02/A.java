package ch02;

public class A {

   public static void main(String[] args) {
	
	   B b= new B();
	   b.method1();
	   
//	   A a=b;
//	   a.method1(); //자식이 부모로 둔갑?한것.
   }
	public void method1() { // 메소드 재정의는 부모 메소드 숨기는 효과
		System.out.println("부모메소드");
	}
}
class B extends A {

	//부모메소드를 숨기는 효과.
	@Override//지워도 출력결과물에는 상관없음
	public void method1() {
		System.out.println("자식메소드");
		
	}
	
}