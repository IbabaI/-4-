package ch03_for;

public class ForExam07 {

	public static void main(String[] args) {
		
		//초기화 부분이나 증감부분에  , 로 명령문을 나열할 수 있음
		for(int i=1 , y= 1; i<10; i++ , System.out.println(y)) {  
			//for블럭을 빠져나가는 조건이 true
			//(생략하고 세미콜론만 입력 가능)
			
			System.out.println("hello");
			
			//for블럭을 빠져나가는 조건을 블럭내에서 처리{}
		if(i==10) break; //블럭을 빠져나가는 명령문 break;
		y++;
		}
		System.out.println("end");

	}

}
