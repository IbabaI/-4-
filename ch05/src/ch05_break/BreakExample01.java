package ch05_break;

import java.util.Scanner;

public class BreakExample01 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.println(">>");
			String text=scanner.nextLine();// 한 줄 단위로 문자열을 입력받는 메소드
			
			System.out.println("입력값:" +text);
		//사용하면 결과가 안나옴	if(text=="exit")//"exit"이 입력되면 반복 종료
		//가능	if(text.equals("exit"));  //내용비교	
			if("exit".equals(text)) // exit 리터럴이 String객체가 됨 -> 객체는 메소드를 가짐
			
			break;
		}
		System.out.println("종료합니다.");
		scanner.close();

	}

}
