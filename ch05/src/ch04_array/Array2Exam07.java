package ch04_array;

public class Array2Exam07 {

	public static void main(String[] args) {
		
		// 평균 합 과 총점의 평균값 나온 소스
		
		//2차원배열 - 성적표 작성
		String title = "성적표";
		String[] head = {"이름","국어","영어","수학","총점","평균"};
		System.out.println("\t\t"+title);
		for(String h:head)System.out.print(h+"\t");
		System.out.println("\n===========================================");
		
		String[] name= {"홍길동","일지매","임껑정", "이순신"};
		int sum=0;
		int avg=0;
		int[] tot =new int[5]; //각 행의, 각 열의 값 누적해서 저장하기 위한 변수
				
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,65,87}};
		
		//출력
		for(int i=0; i<score.length; i++) {//score.length- 배열의 행의 갯수
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) { // score[i].length = 배열의 각 행의 열의 갯수
				System.out.print(score[i][j] + "\t");
				sum+=score[i][j]; //각 행별 누적값 계산
		        tot[j]+=score[i][j]; // 각 과목별 누적값 계산[국+국+국+국][영+영+영+영][수+수+수+수][]
		        avg=sum/score[i].length;	
		
			}// 안쪽 for문
			System.out.println(sum+"\t"+sum/score[i].length);
			
			tot[tot.length-1]+=sum; //tot 마지막에 sum값 저장
			tot[tot.length-2]+=avg;
			sum=0; //초기화
			avg=0;
		}//바깥쪽 for문
		System.out.println("\n===========================================");
		// 각 과목별 합계 구하기
		System.out.print("합 계\t");
		for(int i=0; i<tot.length; i++) {
			System.out.print(tot[i]+"\t");
			//sum+=tot[i];
		}
		System.out.println(tot[tot.length-2]/3);
		System.out.println("\n===========================================");
		
	}

}
