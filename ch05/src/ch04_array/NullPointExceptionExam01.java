package ch04_array;

public class NullPointExceptionExam01 {

	public static void main(String[] args) {
		
		/* ���� ���� ����� �����ϰ� ��ü ������ ���� ������
		 * NullPointException���ܰ� �߻�*/
		
			
			//�����Ͻô� ���������� ������ �����Ƿ� ���� �߻����� ����
			//Ÿ���� []�� Ÿ������ �迭�� �����Ѵٴ� �ǹ�
			int[] intArray = null;// ��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����
			// intArray = new int[10];  //�迭 ��ü ���� new Ÿ��[]�� �ڹٿ��� �迭�� �����Ѵٴ� �ǹ�
			intArray[0] = 10; // ���α׷� ������ ���� �߻�
			
			
			String str=null; // ��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����
		//	str ="hello"; // "hello"���ڿ� ��ü ����
			System.out.println("�� ���� ��: " + str.length());
			//���α׷� ���� �� ���� �߻� - runtime exception
	}

}
