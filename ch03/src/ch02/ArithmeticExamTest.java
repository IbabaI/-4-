package ch02;

import java.util.Scanner;

public class ArithmeticExamTest {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		System.out.println("2�ڸ� ������ �Է��Ͻÿ�:");
		input = scanner.nextInt();

		System.out.println("�����ڸ���:" + (input / 10));
		System.out.println("�����ڸ���:" + (input % 10));

		
Scanner scanner1 = new Scanner(System.in);
		
		int input1 = 18;
		
		System.out.println("������ �Է��Ͻÿ�:");
		input = scanner1.nextInt();
		if (input1 / 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}
	}
}
