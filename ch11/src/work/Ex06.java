package work;

public class Ex06 {

	public static void main(String[] args) {
		
		System.out.println(" 다음에 주어진 바이트 배열을 문자열로 변환시켜보세요\r\n"
				+ " {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};");
		
		byte[] bytes =  {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str =new String(bytes);
		System.out.println(str);

	}

}
