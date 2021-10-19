package work;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

/*과제 제출기한 10/4일(월) 23:59분 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게 만들고 
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 * */

public class Work01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String personal=scanner.next();
		boolean run = true;
		String se,age,height,weight;	
		int cnt=0;
		double sum = 0;
		
		while(run) {
			System.out.println("==============================");
			System.out.println("1.성별|2.나이|3.키|4.몸무게|5.종료");
			System.out.println("==============================");
			System.out.println("선택>");
			int menu = scanner.nextInt();
			      
			switch(menu) {
			
			case 1:
			 System.out.println("성별>");
			 se=scanner.next();
			 
			 
			case 2:
			 System.out.println("나이>");
			 age=scanner.next();
			 
			case 3:
			 System.out.println("키>");
			 height=scanner.next();
			
			case 4:
			 System.out.println("몸무게>");
			 weight=scanner.next();
			 break;
			case 5:
			    run = !run;  break;
			}break;
		}
		
		
    
		while(run) {
			
			final double ST1 = 1.10;
			final double ST2 = 128;
			if(cnt==5)
				
			
			System.out.println(cnt+"회 실패하였습니다. 프로그램을 다시 시작합니다");
		   	
			   System.out.println("키와 몸무게를 입력하세요.");
			   System.out.println("키>");
			   double num1=scanner.nextDouble();
			   
			   System.out.println("몸무게>");
			   double num2=scanner.nextDouble();
			   
			    
			 
			   System.out.println("제지방량: "+fat);
			   if(ST1 * num2 - (ST2 * (num2 * num2) / (num1 * num1)));
			   fat += scanner.nextInt(); 
           
			
		
		
		
	/*	// 제지방량 구하기
		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		//제지방량
		double result = ST1 * weight - ST2 * 
			((weight * weight) /(double)(height * height)); 

		System.out.println(result);

		// 체지방량 구하기
		double result2 = weight - result;

		System.out.println(result2);

		// 체지방률 구하기 = 체지방량*100/체중
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;
				
		 System.out.println(result3);
		 */
		}
		}
}



