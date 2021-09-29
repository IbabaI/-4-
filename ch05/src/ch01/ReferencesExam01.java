package ch01;

public class ReferencesExam01 {

	public static void main(String[] args) {
		
		//리터럴로 문자열 생성 - 리터럴 특성을 따른다
			String strA = "홍길동";
			String strB = "홍길동";
			if(strA==strB)System.out.println("같은 문자열을 참조한다");
			else System.out.println("다른 문자열을 참조한다");
				
			//new String() - 생성자로 문자열 생성 - 참조타입 특성을 다른다
			// 참조타입은 생성시 new 클래스명();으로 생성
			String str1=new String("홍길동"); // 참조타입 
			String str2=new String("홍길동"); // 참조타입
			if(str1==str2)System.out.println("같은 문자열을 참조한다");
			else System.out.println("다른 문자열을 참조한다");
				
			str1 = "일지매";
			str2 = "홍길동일지매";
			if(str1==str2)System.out.println("같은 문자열을 참조한다");
			else System.out.println("다른 문자열을 참조한다");

	}

}
