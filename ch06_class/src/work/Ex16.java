package work;

// �޼ҵ� �����ε� ����
public class Ex16 {

	private static String ture;

	public static void main(String[] args) {
		
		 Printer printer = new Printer();
		 printer.println(10);
		 printer.println(true);
		 printer.println(5.7);
		 printer.println("ȫ�浿");

		
	}

}
class Printer {
	//�޼ҵ� �����ε�
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