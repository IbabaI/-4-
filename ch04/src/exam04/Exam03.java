package exam04;

public class Exam03 {

	public static void main(String[] args) {
	
		System.out.println("for���� �̿��ؼ� 1���� 100���� ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��� ������");
	
		// �������� ���� ���� Ÿ�� ���� �����ϰ� 0���� �ʱ�ȭ
		int sum=0; // �ʱ�ȭ
		for(int i =1; i<=100; i++)  { // 1���� 100����
			if (i%3==0)    // 3���� �������� �� �������� 0 �� ���� 3�� ���
				// �������(�ش���� ���� �������� 0) i%5==0, i%6==0
				sum += i; // sum = sum+i
		}
		System.out.println("3�� ����� �� : " +sum);
	
	
	}

}
