package work;

public class Ex12 {

	public static void main(String[] args) {
		
		System.out.println("문자열\"200\"을 정수로 변환하는 코드와 숫자 150을 문자열로 변환하는 코드를 작성해보세요.");
		
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 =String.valueOf(intData2);
		
		System.out.println(strData2);

	}

}
