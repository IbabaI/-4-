package ch08_member02;


import ch08_member01.B01;
import ch08_member01.B02;
import ch08_member01.B03;
import ch08_member01.B04;

public class A {

	//다른 패키지의 클래스 멤버가 public이므로 멤버에 접근 가능.
	  void f() {
		  B01 b=new B01();
		  b.n=3;
		  b.g();
	  }
	   void f1() {
		   B02 b2=new B02();
		   //b2.n=10;
		   //b2.g();
	   }
	   void f2() {
		   B03 b3 = new B03();
		   //default접근지정 멤버는 다른패키지의 클래스에서 접근불가.
		   //필드
		   //b3.n=10;
		   //메소드
		   //b3.g();
	   }
	   
	   void f3() {
		   B04 b4=new B04();
		   //protected선언 멤버는 다른패키지에서 접근 불가.
		   //b4.n=10;
		   //b4.g();
	   }
	   
}
