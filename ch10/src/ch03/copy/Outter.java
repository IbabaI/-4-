package ch03.copy;

public class Outter {

	A a=new A();
	void method() {
		try {
		a.method();
	}catch(Exception e) {
		System.out.println("A�޼ҵ忡�� �߻��� ����");
	}
}
}
