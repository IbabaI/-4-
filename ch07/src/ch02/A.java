package ch02;

public class A {

   public static void main(String[] args) {
	
	   B b= new B();
	   b.method1();
	   
//	   A a=b;
//	   a.method1(); //�ڽ��� �θ�� �а�?�Ѱ�.
   }
	public void method1() { // �޼ҵ� �����Ǵ� �θ� �޼ҵ� ����� ȿ��
		System.out.println("�θ�޼ҵ�");
	}
}
class B extends A {

	//�θ�޼ҵ带 ����� ȿ��.
	@Override//������ ��°�������� �������
	public void method1() {
		System.out.println("�ڽĸ޼ҵ�");
		
	}
	
}