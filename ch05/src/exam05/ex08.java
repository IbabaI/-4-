package exam05;

public class ex08 {

	public static void main(String[] args) {
		
		System.out.println("주어진 배열의 전체 항목의 합과 평균값을 구해보세요(중첩 for문을 이용하세요)");
		
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum =0;
		double avg =0.0;
		
		//작성위치
		
		int cnt = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length;j++) {
				sum += array[i][j];
			}
			cnt +=array[i].length;
			
		}
		avg = (double)sum / cnt;
		
		//여기까지 작성
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}

}
