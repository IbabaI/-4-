package ch03;

import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요:");
		
		//스캐너타입 변수 선언 및 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기 String next()
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next(); // 문자열 읽기 String next()
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt(); // 정수 읽기 int nextInt()
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble(); // 실수 읽기double nextDouble()
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean(); // 논리값 읽기 //boolean nextBoolen()
		System.out.println("독신 여부는 " + (single ?"싱글 ": "유부")+"입니다.");
		
		// print 와 println의 차이는 줄바꿈이다.(print and new Line)
		
		scanner.close(); // scanner 닫기


	}

}
