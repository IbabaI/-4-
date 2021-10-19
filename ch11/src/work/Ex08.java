package work;

import java.util.StringTokenizer;

public class Ex08 {

	public static void main(String[] args) {
		
		System.out.println("���� ���ڿ����� ��ǥ(,)�� ���еǾ� �ִ� ���ڿ��� String�� split()�޼ҵ� �Ǵ� StringTokenizer�� �̿��ؼ� �и��غ�����");
		
		System.out.println("���̵�, �̸�, �н�����");
		
		
		String str ="���̵�, �̸�, �н�����";
		
		//���1 (split()�޼ҵ� �̿�)
		
		String[] tokens = str.split(",");
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		
		//���2 (StringToKenizer �̿�)

		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

	/*���ప : 
	 * ���̵�
	 * �̸�
	 * �н�����
	 * 
	 * ���̵�
	 * �̸�
	 * �н�����
	 * 
	 * */
}
