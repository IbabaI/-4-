package ch04_array;

public class ArrEx01 {

	public static void main(String[] args) {
		
		// 1,2,3,4,5 1차원배열 - 초기값을 알고 있을 때
		int[] arr1 = {1,2,3,4,5};
		
		//1차원 3개로 2차원 배열 만들기 {1,2,3},{4,5,6},{7,8,9}
		int[][] arr2= { {1,2,3},
				        {4,5,6},
				        {7,8,9} };//3행 3열의 이차원배열
        // {{}} 의 의미가 2차원 배열
		
		//2차원 2개로 3차원 배열 만들기
		//{ { {1,2,3},{4,5,6},{7,8,9} },{ {11,12,13},{14,15,16},{17,18,19} } }
        int[][][] arr3= { 
        		          { {1,2,3},
        	                {4,5,6},
        	                {7,8,9} },
        		          { {11,12,13},
        	                {14,15,16},
        	                {17,18,19} } 
        	                };
        //String.toString();
        for(int i=0; i<arr3.length; i++) {
        	for(int j=0; j<arr3[i].length; j++) {
        		for(int k=0; k<arr3[i][j].length; k++) {
        			System.out.print(arr3[i][j]+" "); //16진수로 값 표시
        			//System.out.print(arr3[i][j][k]+" "); k까지 넣으면 인덱스값으로 표시
        		}
        		System.out.println();
        	}
        }
        
	}

}
