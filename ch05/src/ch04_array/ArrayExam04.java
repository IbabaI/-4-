package ch04_array;

import java.util.Scanner;

public class ArrayExam04 {

	public static void main(String[] args) {
		
		//성적표 프로그램
	    //스캐너로 값을 입력받기 int[] score = {76, 45, 34, 89,100,50, 90,92}; 
		// int[] scores=new int[8];
		//입력이 끝나면 합계, 평균, 성적순 출력하기
		//for문과 향상된 for문으로 출력하기
		// 1. 성적입력 | 2.통계(합/평균)출력 | 3. 성정순 출력하기 | 4. 종료
		//ch04 -7번문제 참조.
        
		//키보드로 부터 정수를 입력받기 위한 scanner객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 배열선언
		int[] scores = new int[8];
		// int[] score = {76, 45, 34, 89,100,50, 90,92};
		
		// 반복문을 빠져나가기 위한 조건
		boolean run = true; 
		
		//합계변수
		int sum=0;
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 성적입력 | 2.통계(합/평균)출력 | 3. 성적순 출력하기 | 4. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택>");
			
			int menu = scanner.nextInt();
			
			// 최대한 줄일 수 있는 만큼 줄였지만 가독성은 좋지 않다.
			switch(menu) {
			case 1:
				System.out.println("성적입력> ");
				for(int i=0; i<scores.length; i++) 	scores[i]=scanner.nextInt();
				break;
					
		    case 2:
				System.out.println("통계출력");
				for(int i:scores) sum+=i;
					System.out.println("성적합계: "+sum);
					System.out.println("성적평균: "+(sum/(double)scores.length));
					break;  // {76, 45, 34, 89,100,50, 90,92};
			 case 3:
				 System.out.println("성적순 출력하기");
				 int temp=0; // 다른데서 사용하지 않는 변수 - 변수 바꾸기 용 임시 저장변수
				 for(int i=0; i<scores.length; i++) {
					 for(int j=i+1; j<scores.length; j++) {
						 if(scores[i]>scores[j]) {
							 temp=scores[i]; //[i]값을 임시변수(temp)에 저장
							 scores[i]=scores[j]; //j의 값을 i에 저장 후(뒤의 값을 앞으로 이동)
							 scores[j]=temp;  // i값을 j위치에 이동(앞의 값을 뒤로 이동)
							//향상된 for문 사용 어려움 
						 }
					 } // 안쪽 for문
				 }// 바깥쪽 for문
				// 정렬된 내용 출력 - 출력되는 문은 향상된 for문 사용가능
					for(int i:scores) {
						System.out.print(i+" ,  ");		
	          }
					System.out.println();
					break;	
							
			case 4: run =!run; break; 
				
			}
			
		}System.out.println("프로그램 종료");
		

	}//반복문
}

