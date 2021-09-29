package NaNAndInfinity;

public class InfinityDataCheckNaNExample01 {

	public static void main(String[] args) {
		// ���ڰ� �ƴ� NaN�� �Է¹޾Ƽ� ���� ó��
		String userInput = "NaN";
		
		//Double�� doubleŸ���� ����Ÿ�� ����� ����ó�����ִ� Ŭ����
		//wrapperŬ������� ��
		//
		Double a = Double.valueOf(5.0); // double������ ����
		Double b = Double.valueOf("5.0"); //double���� ���� ���ڿ��� ����
		
		System.out.println(a.doubleValue());
		System.out.println(b.doubleValue());
		
		// DoubleŸ���� ���� doubleŸ������ auto unboxingó���Ǳ� ����
		System.out.println(a); // Double 5.0 -> double 5.0���� �ڵ� ����ȯ
		System.out.println(b);
		double val = Double.valueOf(userInput);
		
		double currentBalance = 100000.0;
		
		if(Double.isNaN(Double.valueOf(currentBalance))) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			}else {
		currentBalance += val;
		System.out.println(currentBalance);

	}
  }
}
