package ch04_while;

// ���۰� ���� ��Ȯ�� Ƚ���� �� �� �������� while�� ���ٴ� for���� ��ȣ
public class While05 {

	public static void main(String[] args) {
		
		int i =1, j =2; //�ʱⰪ ����
		
		System.out.println("������");
		while(i<=9) {
			while(j<=9) { //for(int j=2,j<=9; j++){}
				System.out.printf("%d * %d = %d \t",j,i,(i*j)); // digit
				// %ǥ�õ� ��ŭ �ڿ� ,�� ǥ�����ش�.
				j++;
								
			}
			j=2; // j�� �� �ʱ�ȭ, vs for���� ���� ������ �� ���� �ʱ�ȭ ������, 
			     // while���� �ʱ�ȭ�� ������ ���־����
			i++; // ���� ó��
			System.out.println(); // �� ��Ʈ �������� ���� ������ �� �ְ� �ٹٲ�
		}
		
	}
}
