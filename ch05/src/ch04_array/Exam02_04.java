package ch04_array;

import java.util.Scanner;

public class Exam02_04 {

	public static void main(String[] args) {
		
		//1. id="hong", pwd="1234"
		// id와 pwd를 scanner로 입력받아서 id와 pwd가 둘다 같으면 "login성공",
        // 아니면 "1회 실패하였습니다". 출력
		// 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료 합니다" 출력 후 종료
	    
		Scanner scanner = new Scanner(System.in);
		int cnt=0; // 초기화
		for(;;) {// 무한반복
			String id,pwd; //참조타입변수
			if(cnt==5) {// 기본데이타 타입의 값 비교 , 5회 해보고 브레이크
		      System.out.println(cnt +"회 실패하였습니다. 프로그램을 종료 합니다");
			  break;
			} // 5번 실패하면 빠져나가는 로직-따로 구하기
			
		   System.out.println("아이디와 패스워드를 입력하세요.");
		   System.out.println("아이디>");
		   id=scanner.next(); //String타입으로 전달
		   
		   System.out.println("패스워드>");
		   pwd=scanner.next();//String타입으로 전달
		   if("hong".equals(id)) {
			   if("1234".equals(pwd)) {
				   System.out.println("로그인 성공"); 
				     break; 
			   }
		   }
			   
			switch(id) {
			case "hong" :
				         switch(pwd) {
				         case "1234" :
				        	 System.out.println("로그인 성공");
				        	 break label;
				         
				     default:
				     }
		    default:
			   
			} 
			
			//실패시
			cnt++; //증가
			if(cnt!=5)
		   System.out.println(cnt +"회 실패하였습니다.");
		}	
		System.out.println("프로그램 종료");
		
		
	}
}