package work;

public class Ex17 {

	private static String ture;

	public static void main(String[] args) {
		

		 Printer1 printer = new Printer1();
		 printer.println(10);
		 printer.println(true);
		 printer.println(5.7);
		 printer.println("ȫ�浿");


	}

}
class Printer1 {
	
	static void println(int x) {
		System.out.println(x);
	}
	static void println(boolean y) {
		System.out.println(y);
	}
	static void println(double k) {
		System.out.println(k);
	}
	static void println(String z) {
		System.out.println(z);
	}
}