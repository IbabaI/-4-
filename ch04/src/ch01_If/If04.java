package ch01_If;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		int score = scanner.nextInt();
		String grade;
		if(score>=90) grade ="A";
		else if(score>=80) grade ="B";
		else if(score>=70) grade="C";
		else if(score>=60) grade="D";
		else grade ="F";
		// printf("����1 ����2", ��1, ��2)
		// %d�� ���� (digit) ����, %s�� ���ڿ�(string) ����
		System.out.printf("������ %d�̰� ������ %s�Դϴ�.",score,grade);
		
				

	}

}