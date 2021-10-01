package ch02;

public class useCalcExam {

	public static void main(String[] args) {
		
		//Calculator 사용하기 위해 객체 생성
		Calculator cal = new Calculator();
		cal.getCalc("+",10,20);
		// 외부에서 접근 가능
		System.out.println(cal.model);
		
		//외부에서 접근불가
	//	System.out.println(cal.result);
		int res = cal.sub(10, 20);
	//	cal.result = cal.sub(10,20);
	//	System.out.println(cal.result);		
		
		//외부에서 수정 불가
	//	cal.model="99999";
		System.out.println(cal.model);

	}

}
