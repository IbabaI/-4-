package ch02_switch;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		
		// 월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
		// 월~목요일 : 확실히 열심히 공부합니다.
		// 금요일 : 쇼핑을 합니다.
		// 토요일, 일요일 : 레저를 즐깁니다.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("요일을 입력해주세요(ex:월요일):");
		String weekDay= scanner.next();
		String str="";
		switch(weekDay) {
		//월~목요일 : 확실히 열심히 공부합니다.
		// 금요일 : 쇼핑을 합니다.
		// 토요일, 일요일 : 레저를 즐깁니다.
		case "월요일": 
		case "화요일": 
		case "수요일": 
		case "목요일": 
		  str="확실히 열심히 공부합니다."; break;
		case "금요일": 
		  str = "쇼핑을 합니다"; break;
		case "토요일": 
		case "일요일":
          str="레저를 즐깁니다"; break;
		default: str="없는요일";
		
		}System.out.println(" " +str);
		
		// 스캐너 종료 - 최근 버젼에서는 오토클로즈 되기 때문에 안해도된다.
		scanner.close();
	}

}
