package ch03;

import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���:");
		
		//��ĳ��Ÿ�� ���� ���� �� ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // ���ڿ� �б� String next()
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next(); // ���ڿ� �б� String next()
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt(); // ���� �б� int nextInt()
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble(); // �Ǽ� �б�double nextDouble()
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean(); // ���� �б� //boolean nextBoolen()
		System.out.println("���� ���δ� " + (single ?"�̱� ": "����")+"�Դϴ�.");
		
		// print �� println�� ���̴� �ٹٲ��̴�.(print and new Line)
		
		scanner.close(); // scanner �ݱ�


	}

}
