package NaNAndInfinity;

public class AccuracyExampl01 {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		// System.out.printf("%f\n", number*pieceUnit);
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result +"조각이 남는다");
		
		// 1*10 => 정수
		int totalPieces = apple * 10;
		
		//10-7 = 3 ->정수
		int temp = totalPieces - number;
		
		//실수형태로 변환처리
		// 3/10.0 -> 3.0
		 result = temp/10.0;
		 
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result +"조각이 남는다");

	}

}
