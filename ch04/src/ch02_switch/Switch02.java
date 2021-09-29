package ch02_switch;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int score = scanner.nextInt();
		/*String grade="";
		
		switch(score/10) {
		case 10:
		case 9: grade = "A"; break;	
		case 8: grade = "B"; break;	
		case 7: grade = "C"; break;	
		case 6: grade = "D"; break;	
			
		default: grade = "F"; 	break;
		}

		System.out.printf("성적은 %d이고 학점은 %s", score,grade); }*/
	
	String grade = "";
	switch(score/10) {
	case 10:
	case 9: grade ="A"; break;
	case 8: grade ="B"; break;
	case 7: grade ="C"; break;
	case 6: grade ="D"; break;
	default: grade ="F"; break;
	}
	System.out.printf("성적은 %d이고 학점은 %s입니다.",score,grade);
	
	
	// 학점이 F학점으로 고정되는 이유를 찾지 못함

	}
}
