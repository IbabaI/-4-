package NaNAndInfinity;

public class AccuracyExampl01 {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		// System.out.printf("%f\n", number*pieceUnit);
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result +"������ ���´�");
		
		// 1*10 => ����
		int totalPieces = apple * 10;
		
		//10-7 = 3 ->����
		int temp = totalPieces - number;
		
		//�Ǽ����·� ��ȯó��
		// 3/10.0 -> 3.0
		 result = temp/10.0;
		 
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����,");
		System.out.println(result +"������ ���´�");

	}

}