package ch03_for;

public class ForExam06 {

	public static void main(String[] args) {
		
		//for(초기화; for블럭을 빠져나가는 조건 ;  증감   {실행문}
		for(int i=1; ; i++) {  
			//for블럭을 빠져나가는 조건이 true
			//(생략하고 세미콜론만 입력 가능)
			
			System.out.println(i+"hello");
			
			//for블럭을 빠져나가는 조건을 블럭내에서 처리{}
		if(i==10) break; //블럭을 빠져나가는 명령문 break;
		}
		System.out.println("end");

	}

}
