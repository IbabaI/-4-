package ch03;

public class SystemInExam01 {

	// 표준 입력스트림으로 값 입력시 I/O에러 발생 가능성 있음. - 예외 처리
	public static void main(String[] args) throws Exception{ //예외처리 구문 throws Exception 추가
		
		//교재 126p~128p
		//표준 입력스트림으로 값 입력 받기
		System.out.print("입력:");
		int a = System.in.read();
		System.out.println("출력:"+a);//키보드로 키를 입력 후 엔터키를 누름(엔터키 = '\r' '\n'
		System.in.read();
		System.in.read();
		
		// System.in.read()-48 or '0'; == 숫자
		System.out.print("입력:");
		int num = System.in.read() - 48; // 아스키코드 - 48 -> 48-48 =0
		// int num=System.in.read()-'0';
		System.out.println("출력:"+num);
		System.in.read();// \r
		System.in.read();// \n
		
		//(char)System.in.read(); == 문자
		System.out.print("입력:");
		char char_=(char) System.in.read(); //아스키코드 'A' ->65(int) ->char 'A'b
		// int num = System.in.read()-'0';
		System.out.println("출력:"+char_);
		
		// 스캐너 사용 안했을 때 사용하던 방법임.

	}

}
