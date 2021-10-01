package ch02;

// public 키워드는 외부에서 접근가능한 접근 제어자임
public class Calculator {
	//model명은 외부에서 접근가능, 수정되면 안됨.
	public String model="00001";
	
	//result값은 getCalc에 의해서 처리된 값만 받음
//	public double result=0;
	private double result = 0;  // 외부에서 접근 불가
	
	// 같은 클래스내의 매소드들끼리는 상호 호출 가능.
	public void getCalc(String op, int x, int y) {
		switch(op) {
		case"+": result =add(x,y);
			     System.out.println(add(x,y)); break;
		case"-": result =sub(x,y);
			     System.out.println(sub(x,y)); break;
		case"*": result =mul(x,y);
			     System.out.println(mul(x,y)); break;
		case"/": result =div(x,y);
			     System.out.println(div(x,y)); break;
		}
	}
	// 아래의 메소드들은 getCalc()메소드만 호출가능 - 외부에서 호출불가
	public int add(int x, int y) { return x+y; }
	public int sub(int x, int y) { return x-y; }
	public int mul(int x, int y) { return x*y; }
	public double div(int x, int y) { return x/(double)y; }

	// public을 private로 바꿔주면 외부에서 접근안됨.
}
