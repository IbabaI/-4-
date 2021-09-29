package ch02;

import java.util.Scanner;  //API로 만들어져 있는거 가져다 쓰는 것

public class ArithmeticExam02 {

	public static void main(String[] args) {
		
        int time;
		
        // 키보드로 입력받을 스캐너 객체 생성
        // 타입 변수명
        Scanner scanner = new Scanner(System.in); //새로운 객체값 만들 때 new 사용, 키보드로 값을 받기 위한 문구
		System.out.print("시분시초로 출력하기 ");
		
		System.out.println("계산할 초를 정수로 입력하세요:");
		time = scanner.nextInt(); // 실행하면 여기서 멈춰 있다가 5000 콘솔창에 입력하면 아래 값이 나온다.
		
		//몫과 나머지
		int second = time % 60;  // 60으로 나눈 나머지는 초 5000초 = minute *60 + 나머지 초
		int minute = (time / 60) % 60; 	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; 		// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
				
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");

	}

}
