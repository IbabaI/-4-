package exam03;

public class Exam08 {

	public static void main(String[] args) {
		// 다음은 %연산을 수행한 결과값에 10을 더하는 코드입니다. NaN값을 검사해서
		// 올바른 결과가 출력될 수 있도록 (#1)에 들어갈 NaN을 검사하는 코드를 작성하세요.
		
		 double x = 5.0;
		 double y = 0.0;
		
		 double z1 = x/y; // 5.0/0.0 몫
		 double z = x % y; // 5.0/0.0 나누고 나머지값 => NaN 숫자로 표현불가
		 // NaN, Null, String 연산결과 NaN, Null, String
		
		 System.out.println(z1);  // Infinity
		 System.out.println(z);   // NaN
		 if(Double.isNaN(z)) {
		   System.out.println("0.0으로 나눌 수 없습니다.");
		 } else {
		 double result = z +10;  // NaN + 10 = NaN
		   System.out.println("결과: " + result);

	}

  }
}
