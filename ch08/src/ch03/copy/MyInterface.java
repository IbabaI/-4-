package ch03.copy;

public interface MyInterface {

	void method1();
	
	//�������̽����� ��ü�� �ִ� �޼ҵ�, ������ ������ ���ص� ��.
	default void method2() {} //��ü �޼ҵ�
	default void method3() {} //��ü �޼ҵ�
	default void method4() {} // default ������ ������ �ִ� �޼ҵ忡 ������ ���ش�. �߰�����
}

