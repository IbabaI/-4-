package ch01_If;

import java.util.Scanner;

public class If07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(0~100)");
	
		int score = scanner.nextInt();
		String grade="A";
		//���� >=90, ����<95=>A-, 95==A0, ���� >95 <=100 :A+
		if(score>=90) { // 90~100, 90~95, 95, 95~100
			grade ="A"; // 90�� �̻�
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
		else grade ="F"; // ������, 60�̸� ���
		// printf("����1 ����2", ��1, ��2)
		// %d�� ���� (digit) ����, %s�� ���ڿ�(string) ����
		System.out.printf("������ %d�̰� ������ %s�Դϴ�.",score,grade);
		
				

	}

}
