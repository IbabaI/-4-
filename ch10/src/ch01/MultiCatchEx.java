package ch01;

public class MultiCatchEx {

	public static void main(String[] args) {
		String[] arr= {"hello","hi","bye"};
		String str=null;
		//발생하는 예외객체 별로 catch절 추가
		try {
		System.out.println(arr[3]); //인덱스 오류
		int a=Integer.parseInt("십"); // 숫자형 오류
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외");
		
		}catch(NumberFormatException e) {
			System.out.println("숫자형 예외");
		}catch(Exception e) {//상위 레벨 예외가 아래에 와야 됨.
			System.out.println("다른 예외");
		}
	}

}
