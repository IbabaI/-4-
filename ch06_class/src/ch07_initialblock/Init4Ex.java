package ch07_initialblock;

public class Init4Ex {

	public static void main(String[] args) {
		
		Product p1 = new Product();
	  }

	}

class Product {
	// static�ʵ�
	static int cnt;
	// �ν��Ͻ� �ʵ�
	int serialNo;
	// �ν��Ͻ� �ʱ�ȭ ��
	{
		cnt++; // static�ʵ� ����
		serialNo=cnt; //������ static�ʵ� ���� ��ü ������ �� �ν��Ͻ� ������ ����
	}
	// �ν��Ͻ� �޼ҵ�
	void print() {
		System.out.println("��ǰ ��ȣ: "+serialNo);
	}
}