package NaNAndInfinity;

import java.util.Scanner;

public class InfinityDataCheckNaNExample02 {

	public static void main(String[] args) {
		
		String userInput;
		Scanner scanner = new Scanner(System.in);
		userInput = scanner.next();
		
		double val = Double.valueOf(userInput);
		
		double currentBalance = 100000.0;
		
		if(Double.isNaN(Double.valueOf(currentBalance))) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			}else {
		currentBalance += val;
		System.out.println(currentBalance);

	}
  }
}
