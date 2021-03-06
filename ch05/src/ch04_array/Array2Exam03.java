package ch04_array;
/*
 * 2행 3열의 2차원 배열 생성
 * 1,2,3,4,5,6
 * 1,2,3
 * 4,5,6
 * */
public class Array2Exam03 {

	public static void main(String[] args) {
		
		//초기값으로 2차원배열 생성, 1차원배열 두개로 2차원 배열 하나 생성
				int[][] scores= new int[][]{{1,2,3},{4,5,6}};
				
				//2차원에서 length의 값은 1차원 배열의 갯수 의미
				System.out.println("1차원배열의 갯수: "+scores.length);//2
				
				System.out.println("각 1차원배열의 요수의 수:" + scores[0].length);
				System.out.println("각 1차원배열의 요수의 수:" + scores[1].length);
				//출력
			
				for(int i=0; i<scores.length; i++) {//i는 scores.length로 1차원배열의 갯수
					for(int j=0; j<scores[i].length; j++) {//j는 각 행의 1차원배열의 요소수
						System.out.print(scores[i][j]+" ");
						
					}System.out.println();
				}	
				
				// 과제 
				// 향상된 for문을 이용하여 2차원 배열의 요소들을 모두 출력하세요.
			   // int -> int[] 1차원-> int[][] 2차원 ->int [][][] 3차원
				
				for(int[] t1:scores) {
					for(int t:t1) {
						System.out.print(t+" ");	
				   
					
				} System.out.println();
			}			

	}

}
