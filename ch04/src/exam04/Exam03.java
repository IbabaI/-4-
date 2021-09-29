package exam04;

public class Exam03 {

	public static void main(String[] args) {
	
		System.out.println("for문을 이용해서 1부터 100까지 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요");
	
		// 누적합을 위한 정수 타입 변수 선언하고 0으로 초기화
		int sum=0; // 초기화
		for(int i =1; i<=100; i++)  { // 1부터 100까지
			if (i%3==0)    // 3으로 나누었을 때 나머지가 0 인 값은 3의 배수
				// 배수공식(해당수로 나눈 나머지가 0) i%5==0, i%6==0
				sum += i; // sum = sum+i
		}
		System.out.println("3의 배수의 합 : " +sum);
	
	
	}

}
