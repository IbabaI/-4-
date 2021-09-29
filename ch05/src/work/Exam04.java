package work;

public class Exam04 {

	public static void main(String[] args) {

		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		double result = ST1 * weight - (ST2 * ((double) (weight * weight) / (height * height))); // ���� / (�Ǽ�)���� -> ����/�Ǽ�
																									// -> �Ǽ�
		// 1. ǥ�� �����淮 ��� ����ǥ�� = (1.10 * ü��kg ) - ( 128 * ( ü��kg���� / Űcm���� ) )
		// 82.5 - ( 128 * ( 5625 / 30625) = 23.510204081632654) = 58.98979591836735

		System.out.println(result);
		

		// ��� ü���淮
		double fatMass = weight - result;
		// 2. ǥ�� ü���淮 ��� ü���淮kg = ü��kg - �����淮kg = 16.01020408163265
		System.out.println(fatMass);

		
		double result2 = (result * 100) / weight;
		System.out.println(result2); // 78.65306122448979% �������
		// 3.ǥ�� ������� ��� -> �������% = (�����淮kg * 100 ) / ü��kg

		// ���� ü����� ���ϱ�

		/*
		 * 4. ǥ�� ü����� ��� 
		 * 1) ü�����% = 100 - �������% 
		 * 2) ü�����% = (ü���淮kg * 100 ) / ü��kg
		 */
		final double ST3 = 100;

		double fatMass2 = ST3 - result2; // 1) ü�����% = 100 - �������%
		System.out.println(fatMass2); // 21.34693877551021%
		double fatMass3 = (fatMass * ST3) / weight;
		System.out.println(fatMass3); // 21.3469387755102%
	}

}
