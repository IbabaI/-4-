package ch04_array;

public class Array2Exam04 {

	public static void main(String[] args) {
		
		//1차원의 초기값을 가지는 배열로 2차원 배열 만들기
		
		String[][] snake= {{"구렁이,팔렁이,칠렁이"},{"구렁상, 구렁사, 구렁오"}};
		
		//출력
		for(int i=0; i<snake.length; i++) { //snake.length- 배열의 행의 갯수
			for(int j=0; j<snake[i].length; j++) { // snake[i].length = 배열의 각 행의 열의 갯수
				System.out.println(snake[i][j]);
			if(j!=snake[i].length-1) //length-1 = 제일 마지막 index번호
				System.out.print(",");
		}
			System.out.println();	
		}
	}

}
