package ch01.copy.copy;

import ch01.copy.copy.A.C;

public class OutterMain {

	public static void main(String[] args) {
		
		
		//Ŭ����.static����� ����
		A.C c = new A.C();
		
		//C�� �ν��Ͻ� ���
		c.field1=3;
		//C�� static���
		c.field2=3;

	}

}
