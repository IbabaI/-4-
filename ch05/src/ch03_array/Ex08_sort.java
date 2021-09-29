package ch03_array;

public class Ex08_sort {

	public static void main(String[] args) {
		
		int[] score = {76, 45, 34, 89,100,50, 90,92}; 
		// 34, 45, 50, 76, 89, 90, 92, 100
		// 1차원 배열의 오름차순 정렬
		
		// 공식이다. 외워야함.
		
		int temp = 0; // 배열 요소의 값을 임시 저장할 변수선언
		for(int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i]>score[j]) {// i의 값이 크면 j의 값과 교환 // 내림차순은 > 부호만 <으로 바꿔주면됨
					temp=score[i]; //[i]값을 임시변수(temp)에 저장
				    score[i]=score[j]; //j의 값을 i에 저장 후
				    score[j]=temp; //임시저장한 값을 다시 j에 저장
				    // 향상된 for문 으로 하기에는 힘들다. 앞에값 뒤에값 비교해야되기 때문
				}
			
			}
		}
		// 정렬된 내용 출력
		for(int i:score) {
			System.out.println(i+"   ");		

	}
	}
}
