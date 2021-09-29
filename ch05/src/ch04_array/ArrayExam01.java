package ch04_array;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		//성적표 프로그램
	    //스캐너로 값을 입력받기 int[] score = {76, 45, 34, 89,100,50, 90,92}; 
		// int[] scores=new int[8];
		//입력이 끝나면 합계, 평균, 성적순 출력하기
		//for문과 향상된 for문으로 출력하기
		// 1. 성적입력 | 2.통계(합/평균)출력 | 3. 성정순 출력하기 | 4. 종료
		//ch04 -7번문제 참조.
        
		
		// 내가 풀어본것
		int[] score = {76, 45, 34, 89,100,50, 90,92};
		int temp = 0;
		boolean run = true; 
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 성적입력 | 2.통계(합/평균)출력 | 3. 성적순 출력하기 | 4. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택>");
			
			int sum=0;
			int menu = scanner.nextInt();
			
			
			switch(menu) {
			case 1:
				for(int i=0; i<score.length; i++) {
					
					menu = scanner.nextInt();
					System.out.println("1. 성적입력: ");
					sum +=score[i];
					System.out.println("합계:"+sum);
					}
					break;
					
		    case 2:
				for(int i=0; i<score.length; i++) {
					
					sum += scanner.nextInt();
					System.out.println("2.통계(합/평균)출력 : "+sum);
					
					double avg=0.0;  
					avg=sum/(double)score.length;
					System.out.println("평균:"+sum/(double)score.length);			
					break;
				} 
			 case 3:
				 
				 for(int i=0; i<score.length; i++) {
					 
					 menu += scanner.nextInt();
						System.out.println("3. 성적순 출력하기 : "); 
						
						for(int j=i+1; j<score.length; j++) {
							if(score[i]>score[j]) {// i의 값이 크면 j의 값과 교환 // 내림차순은 > 부호만 <으로 바꿔주면됨
								temp=score[i]; //[i]값을 임시변수(temp)에 저장
							    score[i]=score[j]; //j의 값을 i에 저장 후
							    score[j]=temp; //임시저장한 값을 다시 j에 저장
							    // 향상된 for문 으로 하기에는 힘들다. 앞에값 뒤에값 비교해야되기 때문
							}
						
						}
					}
					// 정렬된 내용 출력
					for(int i:score) {
						System.out.println(i+"   ");  break;  
						
				}case 4: run =!run; break; 
				
				default: System.out.print("다른 메뉴를 고르세요");
				
			}
			
		}System.out.println("프로그램 종료");
		

	}

}
