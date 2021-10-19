package work;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

/*과제 제출기한 10/4일(월) 23:59분 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게 만들고 
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 * 
 * 1. 표준 제지방량 계산 
 * 남성표준 = (1.10 * 체중kg ) - ( 128 * ( 체중kg제곱 / 키cm제곱 ) )
 * 여성표준 = (1.07 * 체중kg ) - ( 128 * ( 체중kg제곱 / 키cm제곱 ) )
 * 
 * 2. 표준 체지방량 계산 체지방량kg = 체중kg - 제지방량kg
 * 
 * 3.표준 제지방률 계산 -> 제지방률% = (제지방량kg * 100 ) / 체중kg
 * 
 * 4. 표준 체지방률 계산 
		 * 1) 체지방률% = 100 - 제지방률% 
		 * 2) 체지방률% = (체지방량kg * 100 ) / 체중kg
		 * 
		 * 
		 * 선생님 풀이
 * */

public class Work04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final double maleSTD = 1.10, femaleSTD=1.07;
		final int COMSTD =128, COMSTD2=100;
		boolean run=true;
		
		while(run) {
			System.out.println("==============================");
			System.out.println("정확한 계산을 위하여 아래 정보를 입력 바랍니다");
			System.out.println("==============================");
			System.out.println("성별(남자(M)/여자(F)입력)> ");
			int gender = scanner.nextInt();
			System.out.println("나이(정수 : 10~39 입력)> ");
			int age = scanner.nextInt();
			System.out.println("키 입력(단위:cm)> ");
			double height =scanner.nextDouble();
			System.out.println("몸무게 입력(단위:kg)> ");
			double weight = scanner.nextDouble();
			
			
		
    
		// 1. 제지방량 구하기
			double leanBodyMass=0.0;
			switch(gender) {
			case 'M' : leanBodyMass=(maleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
			case 'F' : leanBodyMass=(femaleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
			}
		    
		// 2. 체지방량 구하기(= 체중 - 제지방량)
			double bodyFatMass = 0.0;
			bodyFatMass = weight - leanBodyMass;
			
		// 2-1. 제지방률(=제지방량*100)/체중	
			double leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
			
		// 3. 체지방률 구하기(=체지방량*100/체충)
			double bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
			
		// 4. 비만도 계산
		//   남 /녀
			String result="";
			switch(gender) {
			case 'M' : if(bodyFatRatio < 12) result ="야윈 몸";
			           else if(bodyFatRatio<=17) result ="표준";
			           else if(bodyFatRatio<=22) result ="과체중";
			           else if(bodyFatRatio<=27) result ="비만";
			           else result ="고도비만";
			        break;
			case 'F' : if(bodyFatRatio < 22) result ="야윈 몸";
	                   else if(bodyFatRatio<=27) result ="표준";
	                   else if(bodyFatRatio<=35) result ="과체중";
	                   else if(bodyFatRatio<=40) result ="비만";
	                   else result ="고도비만";
			}
			
			System.out.println("결과: ");
			System.out.printf("제지방량:%.2f\n", leanBodyMass);
			System.out.printf("제지방률:%.2f\n", leanBodyRatio);
			System.out.printf("체지방률:%.2f\n", bodyFatMass);
			System.out.printf("제지방률:%.2f\n", bodyFatRatio);
			System.out.println("결과: "+result);
			
			System.out.println("계속할까요?(yes/no)");
			String yesNO=scanner.next();
			if( yesNO.equals("no")) run =!run;
			}
		
		   System.out.println("프로그램 종료");
	}
}



