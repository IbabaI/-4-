package exam05;

public class ex07 {

	public static void main(String[] args) {
		
		
		System.out.println("주어진 배열의 항목에서 최대값을 구해보세요(for문을 이용하세요).");
		
		int max =0, min=100;
		int[] array = {1,5,3,8,2};
	
		// 작성위치
		for(int i =0; i<array.length; i++) {
			if (array[i] > max) max=array[i];
			if (array[i] < min) min=array[i];
		}
		// 여기까지 작성위치
         System.out.println("max: "+ max);
         System.out.println("min: "+ min);
	}

}
