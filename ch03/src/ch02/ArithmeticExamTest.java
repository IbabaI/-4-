package ch02;

import java.util.Scanner;

public class ArithmeticExamTest {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		System.out.println("2자리 정수를 입력하시오:");
		input = scanner.nextInt();

		System.out.println("십의자리수:" + (input / 10));
		System.out.println("일의자리수:" + (input % 10));

		
Scanner scanner1 = new Scanner(System.in);
		
		int input1 = 18;
		
		System.out.println("정수를 입력하시오:");
		input = scanner1.nextInt();
		if (input1 / 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
	}
}
