package exam05;

import java.util.Scanner;

public class ex09_01 {

	public static void main(String[] args) {
		
	/*실행결과
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>1
	 * 학생수>3
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>2
	 * scores[0]>85
	 * scores[1]>95
	 * scores[2]>93
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>3
	 * scores[0]>85
	 * scores[1]>95
	 * scores[2]>93
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>4
	 * 최고 점수 : 95
	 * 평균 점수 : 91.0
	 * -------------------------------------
	 * 1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
	 * -------------------------------------
	 * 선택>5
	 * 프로그램 종료
	 * */	
		
		boolean run =true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");
			
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			//작성위치 
			System.out.print("학생수>");
			studentNum = scanner.nextInt();
			scores = new int[studentNum];
		} else if(selectNo == 2) {
			//작성위치 
			for(int i=0; i<studentNum; i++) {
				System.out.println("점수입력: "+i);
				scores[i] = scanner.nextInt();
				
		} 
			} else if(selectNo == 3) {
			//작성위치 
			for(int i=0; i<studentNum; i++) {
				System.out.println("점수리스트: "+i+scores[i]);
		}
		} else if(selectNo == 4) {
			//작성위치 
			int max =0;
			int sum =0;
			double avg=0;
			
			for(int i=0; i<studentNum; i++) {
				if(scores[i]>max) {
					max = scores[i];
				}
				sum += scores[i];
				
		}
			avg=(double)sum/studentNum;
			
			System.out.println("최고 점수: " +max);
			System.out.println("평균 점수: " +sum);
		} else if(selectNo==5) {
			//작성위치 
			run =false;
	  }
	}
      System.out.println("프로그램 종료");
}
}
