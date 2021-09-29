package ch01;

public class ReferenceNullExam01 {

	public static void main(String[] args) {
		
		String str1 = new String("홍길동");
		System.out.println(str1);
		
		//출력
		str1=null;  // 연결을 끊어주는게 null이다.
		System.out.println(str1); //null

	}

}
