package ch01.copy.copy;

import ch01.copy.copy.A.C;

public class OutterMain {

	public static void main(String[] args) {
		
		
		//클래스.static멤버로 접근
		A.C c = new A.C();
		
		//C의 인스턴스 멤버
		c.field1=3;
		//C의 static멤버
		c.field2=3;

	}

}
