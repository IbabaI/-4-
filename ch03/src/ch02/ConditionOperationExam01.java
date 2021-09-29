/*삼항연산자 끝. 3장 끝 - 과제 : 확인문제 */

package ch02;

public class ConditionOperationExam01 {

	public static void main(String[] args) {
		
		int score = 95;
		// char 변수선언
		char grade;
		// 좋건문 if참 else 거짓
		if(score>90) { // if 블럭
			grade = 'A';
		} else { // else블럭
			grade = 'B';
		}
		
		System.out.println("등급:"+grade); //String + char => String + String 
		//=>"등급:" +'A' => "등급:"+"A" => "등급:A"

		score = 80;
		
		grade = score>90 ? 'A' : 'B';
		System.out.println("등급:"+grade);
	}

}
