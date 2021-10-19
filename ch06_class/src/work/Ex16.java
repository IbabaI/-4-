package work;

// 메소드 오버로딩 문제
public class Ex16 {

	private static String ture;

	public static void main(String[] args) {
		
		 Printer printer = new Printer();
		 printer.println(10);
		 printer.println(true);
		 printer.println(5.7);
		 printer.println("홍길동");

		
	}

}
class Printer {
	//메소드 오버로딩
	void println(int x) {
		System.out.println(x);
	}
	void println(boolean y) {
		System.out.println(y);
	}
	void println(double k) {
		System.out.println(k);
	}
	void println(String z) {
		System.out.println(z);
	}
}