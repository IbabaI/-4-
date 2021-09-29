package ch07;

public class VariableScopeExam01 {

	public static void main(String[] args) {
		
		// main 메소드 블럭내에서 선언된 로컬변수
		int var1;
		
		
		
		if(true) {
			// main메소드내의 if 블럭에서 선언된 로컬변수
			int var2;
			var1 =1; // main메소드 내의 if블럭내에서 사용가능
			var2 =2; // 자신이 선언된 블럭에서만 사용가능
			int result = var1 + var2;
			
			System.out.println(result);
			
		}
		
		
		
		while(true) {
	        // main메소드내의 while블럭에서 선언된 로컬변수
			int  var3;
			System.out.println(var1);
			var3=3;
			var1=4; //while블럭에서 새로운 값 저장
			System.out.println(var1+var3);
			//
		//  var2=5; 식별자가 주어지지 않으면 사용 불가능
				break; // 반복문을 빠져나가게 하는 명령어
				
		}
		
		System.out.println(var1); // break를 사용하지 않으면 오류난다.
	//	System.out.println(var2);
	//	System.out.println(var3);
	}

}
