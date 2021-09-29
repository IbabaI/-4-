package ch03_for;

public class ForExam04 {

	public static void main(String[] args) {
		
		// 1~100까지의 합 구하기
		for(int i =0; i<=10; i++) { 
			System.out.print(i+"\t");
			
		}
		System.out.println(); // 한줄 아래로 띄우기
		
		for(int i =0; i<=10; i+=2) { 
			System.out.print(i+"\t");
		}
        System.out.println(); // 한줄 아래로 띄우기
		
		for(int i =0; i<=10; i+=3) { 
			System.out.print(i+"\t");
		
		}
        System.out.println(); // 한줄 아래로 띄우기
		
		for(int i =1; i<=100; i*=2) { // i=i*2
			System.out.print(i+"\t");
	}
        System.out.println(); // 한줄 아래로 띄우기
		
		for(int i =10; i>0; i--) { // i=i-1, --i
			System.out.print(i+"\t");
}
        System.out.println(); // 한줄 아래로 띄우기
		
		for(int i =10; i>0; i--) { // 초기화 후 i>10 비교연산결과 false이므로 블럭{}실행 안함
			System.out.println(i+"\t");
}      System.out.println(); 
       System.out.println("종료");
}     
}
