package ch07_continue;

public class Continue01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {//2�� �������� �������� 0�̴�. ¦���� �ǹ�, ¦���� ������� �ʱ�-Ȧ���� ���
				continue; //for���̸� i++������ �ٷ� �̵�, �Ʒ� print(i)���� �������� ����
			} 
			System.out.println(i);
		}

	}

}