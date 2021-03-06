package ch04_while;

import java.io.IOException;

public class While04 {

	public static void main(String[] args) {
		
		System.out.println("2~9사이의 숫자를 입력하세요");
		//키보드로 숫자 0을 누르면 입력되는 값은? 48 <-ASCII코드 값
	try { 
		int num = System.in.read()-'0'; // 표준입력 스트림 '0'키를 누른경우 : 48-48 => '1'키를 누른경우 49-48
		System.out.println("구구단"+num +"단");
		int i=1;
		while(i<=9) { //while블럭{}을 빠져나가는 조건
			System.out.println(num+"*"+i+"="+(i*num)); //출력
			i++; // 증가 명령문
		}
		
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("오류발생");  //오류방지를 위래 try catch문 사용
		}
}
}
