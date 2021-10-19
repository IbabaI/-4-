package ch01;

import ch01_inter01.copy.implement;

//인터페이스 선언(참조타입)
//인터페이스의 구성멤버 - 상수, 추상메소드
public interface RemoteControl  {

	//상수
//	public static final int MAX_VOLUME=10;
//	public static final int MIN_VOLUME=0;  //아래에는 static final이 빠졌지만 interface에서는 상관없다.
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	//메소드-추상메소드
	void method(); //선언부 {} 있으면 오류
}
//인터페이스로부터 실체 클래스 구현
class TVRemoteControl implements RemoteControl{

	@Override
	public void method() {
		System.out.println("실체 클래스메소드");
	}
	}

 class A {

	//변수
    public int MAX_VOLUME; //자동으로 0으로 초기화
    //상수
    public int MIN_VOLUME=0;

//메소드-추상메소드
    void method() {MAX_VOLUME=10;} //선언부
}

