package ch06_methods;


public class EX02 {
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.age=20;
		System.out.println("test2:"+test2);
	   }
}

class Test2{
    // �ʵ�
	int age;
	String name; 
	
	// �޼ҵ� - 4����
	void print() {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);

}
}

