package ch02;

public class ArithmeticExam {

	public static void main(String[] args) {
		
		int time = 5000;
		
		System.out.print("시분시초로 출력하기 ");
		
		// int time = scanner.nextInt(); 		// 정수 입력
		
		// 몫과 나머지
		int second = time % 60;  // 60으로 나눈 나머지는 초 5000초 = minute *60 + 나머지 초
		int minute = (time / 60) % 60; 	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; 		// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
				
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");


	}

}
