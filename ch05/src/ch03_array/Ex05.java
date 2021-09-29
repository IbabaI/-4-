package ch03_array;

public class Ex05 {

	public static void main(String[] args) {
		
       double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
		
		//향상된 for문을 이용하여
		//합과 평균 출력
				
		double total =0;
		for(int i=0; i<scores.length; i++)
		    total+=scores[i];
		
		total=0;
		for(double d:scores) { //d는 변수선언한것임
			total+=d;
		}
		System.out.printf("합계:%.2f\n ",total);
		System.out.println("합계: "+(((int)total*10000)/10000));
		System.out.println("합계: "+(((int)total*100)/100));
		System.out.println("합계: "+(int)(total*100)/100.0);
			
			
		double avg=total/(double)scores.length;
		System.out.printf("%.3f", avg); // 소수점 3번째 자리 올림으로 자름
		}	

	}


