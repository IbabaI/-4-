package exam05;

import java.util.Scanner;

public class ex09_02 {

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
		
		switch(selectNo)  {
		case 1: System.out.println("학생수>");
		        studentNum =scanner.nextInt();
		        scores = new int[studentNum];
		        System.out.println("저장할 학샐 수: "+scores.length);
		        break;
		        
		case 2: for(int i=0; i<scores.length; i++) {
			    System.out.print("score["+i+"]>");
			    scores[i]=scanner.nextInt();
		       }
			    System.out.println("입력완료");
                break;
                
		case 3:for(int i=0; i<scores.length; i++) 
			    System.out.println("score["+i+"]>"+scores[i]);
                break;
                
		case 4: int max=0, sum=0;
		
		        for(int i=0; i<scores.length; i++) {
		        	if(scores[i] > max) max=scores[i];
		        	sum +=scores[i];
		        }
			
			System.out.println("최고점수:"+max);
        		System.out.println("평균점수:"+sum/(double)scores.length);
                break;
                
		case 5: run=!run;
                break;
		}
	}
      System.out.println("프로그램 종료");
}
}
