package ch02;

public class ArithmeticExam {

	public static void main(String[] args) {
		
		int time = 5000;
		
		System.out.print("�úн��ʷ� ����ϱ� ");
		
		// int time = scanner.nextInt(); 		// ���� �Է�
		
		// ��� ������
		int second = time % 60;  // 60���� ���� �������� �� 5000�� = minute *60 + ������ ��
		int minute = (time / 60) % 60; 	// 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60; 		// 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
				
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");


	}

}
