package ch08_member01;

public class C {

	public void k() {
		 B01 b=new B01();
		 b.n=7;
		 b.g();
	 }
	 
	 public void k1() {
		 //동일패키지내라도
		 //클래스는 public이므로 접근가능
		 B02 b2=new B02();
		 //필드와 메소드는 private이므로
		 //동일 패키지내에서도 접근 불가
		 //b2.n=10;
		 //b2.g();
	 }
	 
	 public void k3() {
		 B03 b3=new B03();
		 b3.n=10;
		 b3.g();
	 }
	 
	 public void k4() {
		 B04 b4=new B04();
		 b4.n=10;
		 b4.g();
	 }
}
