package exam04_01;

import java.sql.SQLOutput;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Exam07 {

	public static void main(String[] args) {
		
	/* while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금,
	 * 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요. 
	 * 이 프로그램을 실행 시키면 다음과 같은 실행 결과가 나와야 합니다. 
	 * 
	 * ------------------
	   1.예금|2.출금|3.잔고|4.종료
	   ------------------
	   선택>  1
	   예금액 10000  //balance += 10000
	   
	   ------------------
	   1.예금|2.출금|3.잔고|4.종료
	   ------------------
	   선택>  2
	   출금액 2000  //balance -= 2000
	   
	   ------------------
	   1.예금|2.출금|3.잔고|4.종료
	   ------------------
	   선택>  3
	   잔고액 8000   //print(balance);
	   
	   ------------------
	   1.예금|2.출금|3.잔고|4.종료
	   ------------------
	   선택>  4
	   프로그램 종료  run =!run;
	  */

		boolean run = true; //반복처리시 조건문확인 변수
		
		int balance = 0; //현재금액 변수
		
		Scanner scanner = new Scanner(System.in);
		
		//
		while(run) {
			System.out.println("------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------");
			System.out.println("선택>");
		
			int menu = scanner.nextInt();
			if(menu==1) {
				System.out.println("예금액>");
				balance += scanner.nextInt();
			} else if(menu==2) {
				System.out.println("출금액>");
			} else if(menu==3) {
				System.out.println("잔고>"+balance);
			} else if(menu==4) {
				run = !run;
			} else {
				System.out.println("메뉴 번호를 확인하세요");
			}
		}// 작성 위치
			/*
			String money = scanner.next();
			String str = "";
			switch(money) {
			
			case "예금": break;
			case "출금": break;
			case "잔고": break;
			case "종료": break;
			}
			System.out.println(str);*/
		
		
		System.out.println("프로그램 종료");
		scanner.close();
	 } 

}

