package ch01_If;

import java.util.Scanner;

public class SuccessOrFail01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� - ������");
		int score = scanner.nextInt();
		
		// ������ ���̸� ��{}����
		if(score>=80) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		}  // ��ɹ��� �Ѱ��̱� ������ �߰�ȣ ��� �ȴ�. dangling����
		else {
			System.out.println("�ƽ�����. ���հ��Դϴ�.");
		}
		
		// ���׿��������
		System.out.println((score>=80)?"�����մϴ�. �հ��Դϴ�.":"�ƽ�����. ���հ��Դϴ�.");
		
		// ��ĳ�� ����
		scanner.close();

	}

}
