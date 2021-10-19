package ch01_06;

//부모클래스의 default생성자만 호출 super();
public class A {
	public static void main(String[] args) {
		B b;
		b=new B(); //부모클래스의 매개변수 생성자 호출하고싶다면?
	}
	public A() { System.out.println("생성자A"); }
	//일반
	public A(int X) { System.out.println("생성자"+X);	}
}
class B extends A{
	//default생성자
	public B() {
		super(5);  ////부모클래스의 매개변수 생성자 호출하고싶다면 실제값을 넣으면 된다.
		System.out.println("생성자B");}
	
	//super()메소드로 부모클래스의 매개변수 있는 생성자 호출가능.
	public B(int X) { 
		super(X);
		System.out.println("매개변수생성자"); }
}
