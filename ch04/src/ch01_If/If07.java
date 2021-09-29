package ch01_If;

import java.util.Scanner;

public class If07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100)");
	
		int score = scanner.nextInt();
		String grade="A";
		//점수 >=90, 정수<95=>A-, 95==A0, 점수 >95 <=100 :A+
		if(score>=90) { // 90~100, 90~95, 95, 95~100
			grade ="A"; // 90점 이상
			if(score>=95) grade = grade+"+"; // "A" "+" "A+" //96~100
			else if(score==95) grade = grade+"0"; //score ==95; "A"+"0" 95
			else grade +="-"; //"A"+"-" =>"A-"  90~94
		
		}
		
		else if(score>=80) {
			grade ="B";
			if(score>=85) grade = grade+"+"; // "B" "+" "B+" //86~90
			else if(score==85) grade = grade+"0"; //score ==95; "B"+"0" 85
			else grade +="-"; //"B"+"-" =>"B-"  80~84
		}
		else if(score>=70) {
			grade="C";
			if(score>=75) grade = grade+"+"; 
			else if(score==75) grade = grade+"0";
			else grade +="-";
		}
		else if(score>=60) {
			grade="D";
			if(score>=65) grade = grade+"+"; 
			else if(score==65) grade = grade+"0";
			else grade +="-";
		}
		else grade ="F"; // 나머지, 60미만 모두
		// printf("포멧1 포멧2", 값1, 값2)
		// %d는 정수 (digit) 포멧, %s는 문자열(string) 포멧
		System.out.printf("성적은 %d이고 학점은 %s입니다.",score,grade);
		
				

	}

}
