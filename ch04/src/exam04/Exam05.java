package exam04;

public class Exam05 {

	public static void main(String[] args) {
		
	/* 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
	 * (x,y)형태로 출력해보세요. 단, x와y는 10이하의 자연수입니다
	 * 자연수: 0 < x <= 10,   0 < y <= 10  
	 * x :1  ->4 , y: 1,2,3,4,5,6,7,8,9,10  -> 5*y=56 ->n
	 * x :2  ->8 , y: 1,2,3,4,5,6,7,8,9,10  -> 5*y=52 ->n
	 * ....
	 * x :5  ->20 , y: 1,2,3,4,5,6,7,8,9,10  -> 5*y=40 ->8
	 * ....
	 * x :10 ->40 , y: 1,2,3,4,5,6,7,8,9,10  -> 5*y=20 ->4 */

		for(int x =1; x<=10; x++) { // x의 1부터 10까지
			for(int y =1; y<=10; y++) { // y의 1부터 10까지
			if((4*x)+(5*y)==60)  // 4x + 5y = 60
				System.out.println("(" + x + "," + y + ")");	
			}
		}
	
	
	}

}
