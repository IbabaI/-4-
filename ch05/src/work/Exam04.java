package work;

public class Exam04 {

	public static void main(String[] args) {

		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		double result = ST1 * weight - (ST2 * ((double) (weight * weight) / (height * height))); // 정수 / (실수)정수 -> 정수/실수
																									// -> 실수
		// 1. 표준 제지방량 계산 남성표준 = (1.10 * 체중kg ) - ( 128 * ( 체중kg제곱 / 키cm제곱 ) )
		// 82.5 - ( 128 * ( 5625 / 30625) = 23.510204081632654) = 58.98979591836735

		System.out.println(result);
		

		// 평균 체지방량
		double fatMass = weight - result;
		// 2. 표준 체지방량 계산 체지방량kg = 체중kg - 제지방량kg = 16.01020408163265
		System.out.println(fatMass);

		
		double result2 = (result * 100) / weight;
		System.out.println(result2); // 78.65306122448979% 제지방률
		// 3.표준 제지방률 계산 -> 제지방률% = (제지방량kg * 100 ) / 체중kg

		// 과제 체지방률 구하기

		/*
		 * 4. 표준 체지방률 계산 
		 * 1) 체지방률% = 100 - 제지방률% 
		 * 2) 체지방률% = (체지방량kg * 100 ) / 체중kg
		 */
		final double ST3 = 100;

		double fatMass2 = ST3 - result2; // 1) 체지방률% = 100 - 제지방률%
		System.out.println(fatMass2); // 21.34693877551021%
		double fatMass3 = (fatMass * ST3) / weight;
		System.out.println(fatMass3); // 21.3469387755102%
	}

}
