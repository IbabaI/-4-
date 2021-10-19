package ch03.copy;

public interface MyInterface {

	void method1();
	
	//인터페이스내에 실체가 있는 메소드, 구현시 재정의 안해도 됨.
	default void method2() {} //실체 메소드
	default void method3() {} //실체 메소드
	default void method4() {} // default 넣으면 기존에 있던 메소드에 영향을 안준다. 추가가능
}

