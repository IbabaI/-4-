package ch01;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		
		// ���� ������ - ����, ++, --
		
		int x = 10;
		int y = 10;
		int z;
		/*
		System.out.println("---------------");
		x++; // ��������		
		
		System.out.println(x);
		++x;  // ��������
		System.out.println(x);
		System.out.println("---------------");
		
		
		 y--;
		 System.out.println(y);
		 --y;
		 System.out.println(y);
		 System.out.println("-----------------");
*/

		 // �ܵ� ������ �ƴ� �ٸ������ �Բ� ����Ǵ� ���
		 z=x++;
		 System.out.println(z);  // 10
		 System.out.println(x);  // 11
		 
		 // ���� x=11; z=10;
		 z=++x;
		 System.out.println(z);  // 10
		 System.out.println(x);  // 11
		 
		 // ���� y=10; z=12;
		 z=y--;
		 System.out.println(z);  // 10
		 System.out.println(y);  // 9
		 
		 
		// ���� y=9; z=10;
		 z=--y;
		System.out.println(z);  // 8
		System.out.println(y);  // 9
		
		int family = 50;
		family++; //51
		++family; //52
		System.out.println("�츮���� �ı��� ���" + ((family++)+1)+"���̴�");  //53
		System.out.println("�츮���� �ı��� ���" + ((++family)+1)+"���̴�"); // 55
		System.out.println(family);
		
	}

}
