package ch02;

import java.util.Scanner;  //API�� ������� �ִ°� ������ ���� ��

public class ArithmeticExam02 {

	public static void main(String[] args) {
		
        int time;
		
        // Ű����� �Է¹��� ��ĳ�� ��ü ����
        // Ÿ�� ������
        Scanner scanner = new Scanner(System.in); //���ο� ��ü�� ���� �� new ���, Ű����� ���� �ޱ� ���� ����
		System.out.print("�úн��ʷ� ����ϱ� ");
		
		System.out.println("����� �ʸ� ������ �Է��ϼ���:");
		time = scanner.nextInt(); // �����ϸ� ���⼭ ���� �ִٰ� 5000 �ܼ�â�� �Է��ϸ� �Ʒ� ���� ���´�.
		
		//��� ������
		int second = time % 60;  // 60���� ���� �������� �� 5000�� = minute *60 + ������ ��
		int minute = (time / 60) % 60; 	// 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60; 		// 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
				
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");

	}

}
