package ch01_If;

import java.util.Scanner;

public class If06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
	
		int num = scanner.nextInt();
		String str="";
		if(num < 10) str ="10미만";
		else if(num<100) str = "10이상 100미만";
		else if(num<1000) {
			if(num<500) str = "500이상 1000미만";
			else str = "100이상 500미만";
		}
		else str = "1000이상";
		
		System.out.println(str +"의 값입니다.");
				
				
				
				
		
		
				

	}

}
