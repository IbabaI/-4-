package exam05;

public class ex04 {

	public static void main(String[] args) {
		
		System.out.println("배열을 생성하는 방법으로 틀린 것");
		
		System.out.println("1) int[] array={1,2,3};");
		System.out.println("2) int[] array;array={1,2,3};   - x");
		System.out.println("3) int[] array=new int[3];");
		System.out.println("4) int[][]array=new int[3][2];");

		// 배열 변수를 이미 선언한 후에 다른 실행문에서 중괄호를 사용한 배열 생성은 허용되지 않는다.
		// 배열 변수를 미리 선언한 후, 값 목록들이 나주엥 결정되는 상황이라면 다음과 같이 new연산자를 사용해서 값 목록을 지정
		// 변수 = new타입[]{값1,값2,값3...}
	}

}
