package exam03;

public class Exam04 {

	public static void main(String[] args) {
	
		/*534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� 
		 * �л��� �� ���� ���� �� �ְ�, ���������� �� ���� �������� ���ϴ� 
		 * �ڵ��Դϴ�. (#1)��(#2)�� �� �˸��� �ڵ带 �ۼ��ϼ���*/
		
		int pencils = 534;
	    int students = 30;
		
		 // �л� �� ���� ������ ���� ��
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		// ���� ���� ��
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);

		// #1 => pencils/students   #2 => pencils%students
	}

}
