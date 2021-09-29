package ch02;

public class ConditionOpetatorExam {

	public static void main(String[] args) {


		int x=5;
		int y=3;
		
		int s;
		if(x>y) s=1;  //(x>y) 결과값이 s이다
		else s=-1;
				
		System.out.println(s);
		
		//삼항식을 이용한 처리
		s = x>y ? 1:-1;
		System.out.println(s);

	}

}
