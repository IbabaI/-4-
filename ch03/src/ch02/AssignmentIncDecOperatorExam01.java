package ch02;

public class AssignmentIncDecOperatorExam01 {

	public static void main(String[] args) {
		
		//intŸ�� ���� ���� intŸ���̰� �������� �ٸ� ��쿡�� , �� �����ؼ� ���� ����
		int a=3, b=3, c=3; //��ɹ� 1���̴�.  ���� ��ɹ� �������� ��ɹ� 3�� int a=3; int=b=3; int c=3;

				// ���� ������ ���
		a += 3; 		// a=a+3 = 6
		b *= 3; 		// b=b*3 = 9
		c %= 2; 		// c=c%2 = 1 c�� 2�� ������ ������ ���� 1
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
 // ��ü�� ���ڿ��� �� : "a="+6 => "a="+"6" => "a=6", 
	            	// "a=6"+",b" =>  "a=6,b="+"9"  
	            	// =>"a=6,b=9"+",c="  => "a=6, b=9, c=1"
                    // "a=6, b=9,c=" +"1" => "a=6, b=9, c=1"		

		int d=3;
		// ���� ������ ���
		// ++, --�� ���� �տ� ������ ���� ��/�� �� ����ó��
		// ++, --�� ���� �ڿ� ������ ����ó�� �� ��/��
		a = d++; 	// a=3, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; 	// d=5, a=5
		System.out.println("a=" + a + ", d=" + d);
		a = d--; 		// a=5, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = --d; 		// d=3, a=3
		System.out.println("a=" + a + ", d=" + d);


	}

}
