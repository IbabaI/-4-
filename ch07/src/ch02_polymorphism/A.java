package ch02_polymorphism;

public class A {

	B b= new B();
	C c= new C();
	D d= new D();
	E e= new E();
	
	//����
	A a1=b;
	A a2=c;
	A a3=d;
	A a4=e;
	
	B b1=d;
	C c1=e;
	
	//�Ұ��� - ��Ӱ��谡 �ƴ�
	//B b3=e;
	//C c2=d;
	
	//ó���� BŸ������ ���� �� �θ�Ÿ������ promotion�� �ٽ� ����Ÿ��(BŸ��)�� casting����
	B b4=(B)a1;
	
//	B b5= new A();  // ó������ �θ�Ÿ�� ��ü�� �ڽ����������� ���ԺҰ�
	
	//cat�� dog�� �� �� ����
	B b6 = new B();
	C c6 = new C();
	
	//�Ұ��� //java.lang.ClassSastException�߻� - runtime�� �߻�
//	A a6 = b6;
//	c6 = (C)a6;
	
	
}
class B extends A{}
class D extends B{}

class C extends A{}
class E extends C{}