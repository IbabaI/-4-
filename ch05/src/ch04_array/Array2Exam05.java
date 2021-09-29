package ch04_array;

public class Array2Exam05 {

	public static void main(String[] args) {
		
		//1차원의 초기값을 가지는 배열로 2차원 배열 만들기
		
		String[] name= {"홍길동","일지매","임껑정", "이순신"};
		int sum=0;
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,65,87}};
		
		//출력
		for(int i=0; i<score.length; i++) { //score.length- 배열의 행의 갯수
			for(int j=0; j<score[i].length; j++) { // score[i].length = 배열의 각 행의 열의 갯수
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j]; //각 행별 누적값 계산
		}// 안쪽 for문
			System.out.println(sum+"\t"+sum/score[i].length);
			sum=0; //초기화
		}//바깥쪽 for문
	}

}
