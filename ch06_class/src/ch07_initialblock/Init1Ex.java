package ch07_initialblock;

public class Init1Ex {

	public static void main(String[] args) {
	//로컬변수 i1 선언
		Init1 i1 = new Init1();
		int[] b = i1.a; // i1객체의 배열 정보를 b가 받음(얕은복사)
		for(int i:b) {
			System.out.println(i);
		}

	}

}
class Init1 {
	//필드
	int[] a = new int[5];
	//초기화 블럭 인스턴스 초기화 블럭{초기화내용}
	{
		for(int i=0; i<a.length; i++) {
			int k=(int)(Math.random()*10);
			a[i]=k;
		}
	}
}