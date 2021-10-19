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

public class Work03 {
	/* 체지방 구하기 */
	public static void main(String[] args) {
		
			/*
			 * 1. 제지방 구하기 : 남성 1.10*체중 - (128*(체중^2)/(키^2))
			 *                 여성 1.07*체중 - (128*(체중^2)/(키^2))
			 * 2. 체지방량 = 체중 - 제지방량
			 * 2-1. 제지방율 = 제지방량*100/체중
			 * 3. 체지방율 = 체지방량 * 100/체중                
			 * */	
			  Scanner scanner = new Scanner(System.in);	
			  final double maleSTD = 1.10, femaleSTD=1.07;
			  final int COMSTD=128, COMSTD2=100;
			  boolean run=true;
			  
		while(run){	  
			  System.out.println("=====================================");
			  System.out.println(" 정확한 계산을 위하여 아래 정보를 입력 바랍니다");
			  System.out.println("=====================================");
			  System.out.println("성별(M/F) 나이(0~39) 키(cm) 몸무게(kg)순 입력>");
			  String input = scanner.nextLine();
			  String[] arr= input.split(" ");//공백 기준으로 잘라서 문자열 배열로 생성
			  System.out.println(arr.length);
			  String gender = arr[0];
			  int age = Integer.parseInt(arr[1]);
			  double height = Double.parseDouble(arr[2]);
			  double weight = Double.parseDouble(arr[3]);
			  
			 
				/*
				 * System.out.println("성별(남자(M)/여자(F)입력)>");
				 * 
				 * String gender = scanner.next(); System.out.println("나이(정수:10~39 입력)>"); int
				 * age = scanner.nextInt(); System.out.println("키 입력(단위:cm)>"); double height =
				 * scanner.nextDouble(); System.out.println("몸무게 입력(단위:kg)>"); double weight =
				 * scanner.nextDouble();
				 */	  
			  
			  
			  //1.제지방량 구하기 - 메소드 leanBodyMass = getLeanBodyMass(String gender){}
			  double leanBodyMass=0.0;
			  switch(gender) {
			  case "M":leanBodyMass=(maleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
			  case "F":leanBodyMass=(femaleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
			  }
			  
			  //2.체지방량구하기(=체중 - 제지방량)
			  //bodyFatMass = getBodyFatMass
			  double bodyFatMass=0.0;
			  bodyFatMass = weight - leanBodyMass;
			  
			  //2-1. 제지방률(=제지방량*100/체중)
			  //leanBodyRation = getLeanBodyRatio(double a, int weight){}
			  double leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
			  
			  //3.체지방률 구하기(=체지방량*100/체중)
			  //bodyFatRatio = getBodyFatRatio(){}
			  double bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
			  
			  //4. 비만도 계산
			  //남/녀
			  String result="";  // result = getResult(String gender, double bodyFatRatio){}
			  switch(gender) {
			  case "M": if(bodyFatRatio <12) result="야윈 몸"; // 0~12미만
			  			else if(bodyFatRatio <=17) result="표준"; //12~17
			  			else if(bodyFatRatio <=22) result="과체중";//18~22
			  			else if(bodyFatRatio <=27) result="비만"; //22~27
			  			else result="고도비만";// >=28
			            break;
			  case "F":if(bodyFatRatio <22) result="야윈 몸"; // 0~22미만
						else if(bodyFatRatio <=27) result="표준"; //22~27
						else if(bodyFatRatio <=35) result="과체중";//28~35
						else if(bodyFatRatio <=40) result="비만"; //36~40
						else result="고도비만";// >=40
				        break;
			  }
			  
			  //출려메소드 void ptintResult(){}

			  System.out.println("결과:>");
			  System.out.printf("제지방량:%.2f\n", leanBodyMass);
			  System.out.printf("제지방율:%.2f\n", leanBodyRatio);
			  System.out.printf("체지방량:%.2f\n", bodyFatMass);
			  System.out.printf("체지방율:%.2f\n", bodyFatRatio);
			  System.out.println("결과:"+result);
			  
			  //계속 여부 확인
			  System.out.println("계속할까요?(yes/no)");
			  String yesNo = scanner.nextLine();
			  if(yesNo.equals("no")) run=!run;
			  
		      }//while끝.

		     System.out.println("프로그램 종료");
}
}


