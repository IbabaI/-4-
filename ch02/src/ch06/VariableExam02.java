package ch06;

public class VariableExam02 {

	public static void main(String[] args) {
		
		//1���� 10������ �� ���
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		
		// ������� �����ϰų� ���� �ڵ����� ��Ű�ų� ����� ���� �����ϴ� ���� - ����
		//1���� 1000������ �� ���
		int sum = 0;
		for(int i=1; i<=1000;i++) {
			sum = sum+i;
		}
         System.out.println(sum);
	}

}