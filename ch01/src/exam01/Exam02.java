package exam01;

public class Exam02 {

	/* 이것이 자바다 확인문제 2장*/
	public static void main(String[] args) {
		
		
		/* 1. 자바 변수에 대한 설명 중 틀린 것  */
		System.out.println("1.변수는 하나의 값만 저장할 수 있다 int = 10;, 20;,30; 이렇게 안된다");
		System.out.println("2.변수는 선언시에 사용된 타입의 값만 저장할 수 있다 - 타입 변수명");
		System.out.println("3.변수는 변수가 선언된 중괄호{}안에서만 사용가능 - scope(범위)");
		System.out.println("4.변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다 - 반드시 초기화해야 읽을 수 있다  - x");
		
		/* 2. 변수이름으로 사용 가능한 것 모두 선택  */
		System.out.println("1. modelName");
		System.out.println("2. class - x(에약어)");
		System.out.println("3. 6hour - x(숫자로시작불가)");
		System.out.println("4. $value");
		System.out.println("5._age");
		System.out.println("6. int - x(예약어)");
		
		
		/* 3. 자바의 기본타입 8가지 */
		System.out.println("정수타입 : byte(1byte), char/short(2byte), int(4byte), long(8byte)");
		System.out.println("실수타입 : float(4byte), double(8byte)");
		System.out.println("논리타입 : boolean(1byte)");
	
		
		/* 4. 타입, 변수이름(식별자), 리터럴  */
		int age;
		age = 10;
		double price = 3.14;
		System.out.println("타입 int, 변수명 age");
		System.out.println("변수명 age, 리터럴 10");
		System.out.println("타입 double, 변수명 price, 리터럴 3.14");
				
		
		/* 5. 자동 타입 변환, 컴파일 오류  */
		byte byteValue = 10;
		char charValue = 'A';
		int intValue = byteValue;
		    intValue = charValue;
		// 오류 short shortValue = charValue;
		double doublevalue = byteValue;
		
		
		/* 6. 강제 타입 변환(casting) 오류 */
		int intVlaue =  10;
		 char charVlaue = 'A';
		 double doubleValue = 5.7;
		 String stringValue = "A";
		 
		 double var =(double)intValue; // (double)가 없어도 됨
		 byte var1 = (byte)intValue; // 값이 잘릴 수 있음
		 int var2 = (int)doubleValue;
		 // 오류 char var3 = (char)strValue;  //char는 기본타입 - String은 참조타입
		 
		 
		 /*7.변수를 잘 못 초기화 한것은*/
		 int var11 = 10; //int
		 long var12 = 10000000L;  //long
	//오류	 char var13 = ''; 
		 double var14 = 10; //int -> double
		 float var15 = 10; // int -> float
		 
		 
		 /*8.연산식에서 타입변환 내용. 컴파일 오류*/
		 byte byteValue1 = 10;
		 float floatValue1=2.5F;
		 double doubleValue1=2.5;
		 
		 //java의 특성상 byte타입의 값으로 연산시 int 타입으로 변환하여 연산에 참가함.
		 //byte, short, shar -> int타입으로 변환하여 연산에 참가하도록 설계되었음.
		 // 58페이지 상단부분 확인
		 //오류  byte result1 = byteValue + byteValue; ---> byte + byte => int + int => int
		 int result2 = 5 + byteValue1; // int + byte => int
		 float result3 = 5 + floatValue1; // int + float => float
		 double result4 = 5 + doubleValue1; // int + double => double
		 
		 
		 
		 


	}

}
