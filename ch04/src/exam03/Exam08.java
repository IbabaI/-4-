package exam03;

public class Exam08 {

	public static void main(String[] args) {
		// ������ %������ ������ ������� 10�� ���ϴ� �ڵ��Դϴ�. NaN���� �˻��ؼ�
		// �ùٸ� ����� ��µ� �� �ֵ��� (#1)�� �� NaN�� �˻��ϴ� �ڵ带 �ۼ��ϼ���.
		
		 double x = 5.0;
		 double y = 0.0;
		
		 double z1 = x/y; // 5.0/0.0 ��
		 double z = x % y; // 5.0/0.0 ������ �������� => NaN ���ڷ� ǥ���Ұ�
		 // NaN, Null, String ������ NaN, Null, String
		
		 System.out.println(z1);  // Infinity
		 System.out.println(z);   // NaN
		 if(Double.isNaN(z)) {
		   System.out.println("0.0���� ���� �� �����ϴ�.");
		 } else {
		 double result = z +10;  // NaN + 10 = NaN
		   System.out.println("���: " + result);

	}

  }
}
