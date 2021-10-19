package work;

import java.util.StringTokenizer;

public class Ex08 {

	public static void main(String[] args) {
		
		System.out.println("다음 문자열에서 쉼표(,)로 구분되어 있는 문자열을 String의 split()메소드 또는 StringTokenizer를 이용해서 분리해보세요");
		
		System.out.println("아이디, 이름, 패스워드");
		
		
		String str ="아이디, 이름, 패스워드";
		
		//방법1 (split()메소드 이용)
		
		String[] tokens = str.split(",");
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		
		//방법2 (StringToKenizer 이용)

		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

	/*실행값 : 
	 * 아이디
	 * 이름
	 * 패스워드
	 * 
	 * 아이디
	 * 이름
	 * 패스워드
	 * 
	 * */
}
