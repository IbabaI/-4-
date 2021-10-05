package ch06_methods;


public class EX02 {
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.age=20;
		System.out.println("test2:"+test2);
	   }
}

class Test2{
    // 필드
	int age;
	String name; 
	
	// 메소드 - 4유형
	void print() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);

}
}

