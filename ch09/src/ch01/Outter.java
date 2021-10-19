package ch01;

//자바7 까지 표현방식
public class Outter {

	void method(final int arg) {
//		arg=100;  //final이 있기 때문에 사용 x
		final int localBariable;
		localBariable=1;
		//로컬 클래스
		System.out.println(arg);
		//메소드내의 로컬클래스에서 사용되는 변수는 무조건 final필드여야 한다.
		class Innter{
			public void method() {
			    int result = arg+localBariable;
			}
		}
	}
}
