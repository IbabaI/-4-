package ch01_06;

//�θ�Ŭ������ default�����ڸ� ȣ�� super();
public class A {
	public static void main(String[] args) {
		B b;
		b=new B(); //�θ�Ŭ������ �Ű����� ������ ȣ���ϰ�ʹٸ�?
	}
	public A() { System.out.println("������A"); }
	//�Ϲ�
	public A(int X) { System.out.println("������"+X);	}
}
class B extends A{
	//default������
	public B() {
		super(5);  ////�θ�Ŭ������ �Ű����� ������ ȣ���ϰ�ʹٸ� �������� ������ �ȴ�.
		System.out.println("������B");}
	
	//super()�޼ҵ�� �θ�Ŭ������ �Ű����� �ִ� ������ ȣ�Ⱑ��.
	public B(int X) { 
		super(X);
		System.out.println("�Ű�����������"); }
}
