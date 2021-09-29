package ch03;

import java.util.Scanner; //ctrl + shitf +o

public class ScannerExam01 {

	public static void main(String[] args) {
		
		// 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력:");
		//스캐너는 값 입력 후 엔터키를 치면 값 다음의 \r \n을 제거 후 input변수에 저장함.
		String input= scanner.next();
		//타입변환 없이 문자열 형태로 출력
		System.out.println(input);

	}

}
