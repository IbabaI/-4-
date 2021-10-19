package ch01_02;

//부모클래스의 default 생성ㅈ만 호출
public class A {
	public static void main(String[] args) {
		B b;
		b=new B();
	}
	//일반
	public A(int X) {
		System.out.println("생성자"+X);
	}
}
class B extends A{
	//default생성자
	public B() {
		System.out.println("생성자B");	
	}
}