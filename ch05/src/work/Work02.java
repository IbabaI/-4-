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
 * */

public class Work02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String personal=scanner.next();
		boolean run = true;
		
		int cnt=0;
		double sum = 0;
		
		while(run) {
			String se,age,height,weight;	
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
			System.out.println("제지방량 구하기>");
			
			
			double height = 0;
			double weight = 0;
			double fat1 = 0;
			double fat2 = 0;
			double fat3 = 0;
			double fat4 = 0;
	        final double ST1 = 1.10;
	        final double ST2 = 128;
			   System.out.println("키입력>");
			   height=scanner.nextDouble();
			   
			   System.out.println("몸무게입력>");
			   weight=scanner.nextDouble();
			   
			   fat1= ST1 * weight - (ST2 * ((double) (weight * weight) / (height * height))); 
			 
			   System.out.println("제지방량: "+fat1);
			  
			   fat1 += scanner.nextInt(); 
			  
			   
			   System.out.println("체지방량 구하기>");
		       fat2= weight - fat1;
		       
		       System.out.println("체지방량: "+fat2);
				  
			   fat2 += scanner.nextInt(); 
		
			   
			   
			   System.out.println("제지방률 구하기>");
		       fat3= (fat1 * 100 ) / weight;
		       
		       System.out.println("제지방률: "+fat3+"%");
				  
			   fat3 += scanner.nextInt();
			   
			   
			   
			   System.out.println("체지방률 구하기>");
		       fat4 = (fat2*100)/weight;
		       
		       System.out.println("체지방률: "+fat4+"%");
		       
				  
			   fat4 += scanner.nextInt();
			   
			   break;
			   
		
		}
	}
}



