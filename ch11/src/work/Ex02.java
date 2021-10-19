package work;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("여러분이 작성하는 클래스를 동등 비교하는 컬렉션 객체인 HashSet, HashMap,Hashtable을 사용하려고 합니다.\r\n"
				+ "Object의 equals()와 hashCode()메소드를 오버라이딩했다고 가정할 경우, 메소드\r\n"
				+ "호출 순서를 생각하고 다음 (  )안을 채워보세요.");
		
		System.out.println("             같음               true\r\n"
				+ "(    )리턴값  ----> (    )리턴값 -------> 동등 객체\r\n"
				+ "    |                  |\r\n"
				+ "    |                  |  false\r\n"
				+ "    |                  ↓\r\n"
				+ "다름 |----------------->다른객체");
		
		
		System.out.println("hashCode(), equals()");
		

	}

}
