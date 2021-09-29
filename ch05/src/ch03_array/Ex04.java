package ch03_array;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] scores= {78,98,54,76,87};
		System.out.println("배열의 갯수: "+scores.length);
		
		//총점
		int total = 0; //초기화
		for(int i=0; i<scores.length; i++) {
			total+=scores[i];
		}
		System.out.println("총점: "+total);
		//평균 - double타입 형태출력
		double avg=0.0;  //0 으로 해도 상관없음 -> 0.0으로 형변환
		avg=total/(double)scores.length;
		System.out.println("평균: "+avg);
		
		//향상된 for문으로 총점구하기
		total=0;
		for(int s:scores) {
			total +=s; // scores[0], seores[1],...
			System.out.println("총점: " +s);
		}
		avg=total/(double)scores.length;
		System.out.println("평균: "+avg);	

	}

}
