package ch03_array;

public class Ex02 {

	public static void main(String[] args) {
		
   int[] n = new int[5];
		
		n[0] =12; n[1] =20;
		n[2] =67; n[3] =567;
		n[4] =21;
		
		System.out.println("배열의 요소의 갯수:" +n.length);
		for(int i=0; i<n.length; i++) {
			System.out.println("n[" +i +"] = " +n[i]);
		}
		System.out.println("====================");
		System.out.println("향상된 for문 자바 1.5에서 도입.");
		
		//배열개게를 처음부터 끝까지 한번씩 반복하면서
		//읽는 반봅자를 선언하여 사용-향상된  for문
		
		for(int K:n) {
			System.out.print(K+"\t");
		}

	}

}
