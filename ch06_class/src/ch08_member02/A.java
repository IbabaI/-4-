package ch08_member02;


import ch08_member01.B01;
import ch08_member01.B02;
import ch08_member01.B03;
import ch08_member01.B04;

public class A {

	//�ٸ� ��Ű���� Ŭ���� ����� public�̹Ƿ� ����� ���� ����.
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
		   //default�������� ����� �ٸ���Ű���� Ŭ�������� ���ٺҰ�.
		   //�ʵ�
		   //b3.n=10;
		   //�޼ҵ�
		   //b3.g();
	   }
	   
	   void f3() {
		   B04 b4=new B04();
		   //protected���� ����� �ٸ���Ű������ ���� �Ұ�.
		   //b4.n=10;
		   //b4.g();
	   }
	   
}
