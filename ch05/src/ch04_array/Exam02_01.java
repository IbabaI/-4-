package ch04_array;

public class Exam02_01 {

	public static void main(String[] args) {
		
		//�⺻Ÿ�� �� ��
		int a = 10;
		int b = 10;
		System.out.println(a==b?"����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �����ϴ�.":"����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �����ϴ�.");
		System.out.println(a!=b?"����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �ٸ��ϴ�.":"����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �ٸ��� �ʽ��ϴ�.");
	
       // ����Ÿ�� �� ��
		
		String str1= new String("hello");
		String str2= new String("hello");
		System.out.println(str1==str2?"str1�� ����� str2�� ������ �����ϴ�.":"str1�� ����� str2�� ������ �ٸ��ϴ�.");
		// == �����ڴ� ��ü�� ���ٴ� �ǹ��ε� ������ ���ٰ� �ϴ°��� Ʋ�� ǥ��, 
		// ����Ϸ��� str1�� �����ϴ� �ּҿ� str2�� �����ϴ� �ּҰ� �����ϴ�.":"str1�� �����ϴ� �ּҿ� str2�� �����ϴ� �ּҰ� �ٸ��ϴ�.");
		
		System.out.println(str1.equals(str2)?"str1�� ����� str2�� ������ �������� �����մϴ�."
				                             :"str2�� ����� str2�� ������ �������� �������� �ʽ��ϴ�.");
		
		
	}
	

}
