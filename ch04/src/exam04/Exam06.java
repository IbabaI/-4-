package exam04;

public class Exam06 {

	public static void main(String[] args) {
		
		
		
		System.out.println("for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요");
		/* 
		 * 
		 *  *
		 *  *  *
		 *  *  *  *
		 *  *  *  *  *
		 *  */
		for(int x =1; x<=5; x++) { // i : 1  ,2, 3, 4, 5
			for(int y =1; y<=x; y++) { // j :1 ,2, 3, 4, 5
				
			System.out.print("*"); // 가로
			
		} System.out.println(); // 세로
		
	
		}
	}

}
