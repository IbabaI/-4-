package ch05_DoWhile;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int num = 0, i=1;
		
		do {
		System.out.println("������� ������ ���ڸ� �Է��ϼ���");
		num = scanner.nextInt();
		if(num<=9 && num>=2) {
			do { 
				System.out.println(num+ "*" +i+ "=" +(num*i));
				i++; //���� ����
			}while(i<=9);

		}
		}while(num>9 || num<2); //���� ���𳪴� ����
	}
}

