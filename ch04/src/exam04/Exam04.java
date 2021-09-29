package exam04;

public class Exam04 {

	public static void main(String[] args) {
		
	/*while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때
	 * 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속
	 * 주사위를 던지고 , 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요
	 * 눈의 합이 5가 되는 조합은 (1,4),(4,1),(2,3),(3,2)입니다. */
		
		/* x + y = 5  (1<=x<=6, 1<=y<=6);
		 x가 1일때 y : 1,2,3,4,5,6 -> 4
		 x가 2일 때 y :1,2,3,4,5,6 -> 3
		 x가 3일 때 y :1,2,3,4,5,6 -> 2
		 x가 4일 때 y :1,2,3,4,5,6 -> 1
		 x가 5일 때 y :1,2,3,4,5,6 -> x
		 x가 6일 때 y :1,2,3,4,5,6 -> x		 for문 보다는 while문 
		 */

		int num1=0;
		int num2=0;
		int cnt=0;
		
		while(true)  { //무한반복
			num1 = (int)(Math.random() * 6)+1;  // 1<=x<=6
			num2 = (int)(Math.random() * 6)+1;  // 1<=y<=6
		
		if(num1+num2==5) break;{ //무한반복 빠져나가는 조건
			cnt++;
		}
		System.out.println("(" + num1 + "," + num2 +")");
		System.out.println("총반복횟수:"+cnt);
	
	}

}
}