package work;

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("Tire Ŭ������ ��ӹ޾� SnowTire Ŭ������ ������ ���� �ۼ��߽��ϴ�. \r\n"
				+ "SnowTireExample Ŭ������ �������� �� ��� ����� �����ϱ��?");
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;   //promotion
		
		
		//�������̵�� �޼ҵ��� �������ε�
		//�޼ҵ��� ���೻���� ȣ������� ����
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ�� �θ�Ÿ������ �� ��ȯ�� �Ǿ �ڽ�Ŭ�������� �����ǵ� �޼ҵ��� ������ �����-������
		snowTire.run();
		tire.run();
	}
}
	 class Tire {
		public void run() {System.out.println("�Ϲ� Ÿ�̾ �������ϴ�."); }
	}


	

 class SnowTire extends Tire{
	@Override
	public void run() {System.out.println("����� Ÿ�̾ �������ϴ�."); }
}

/*1. ���� SnowTire Ŭ���� Ÿ���� snowTire�� �̸��� ���� ��ü�� �����Ѵ�.

2. �� ��ü�� Tire Ŭ���� Ÿ����  tire��� ��ü�� �Ҵ��Ѵ�.

3. �� �� Tire�� SnowTire�� �θ� Ŭ�����̱� ������ �ڵ� Ÿ�� ��ȯ�� �Ͼ��.

4. �Ϲ������� �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���Ŀ��� �θ� Ŭ������ ����� �ʵ�� �޼ҵ常 ������ �����ϴ�. ������ �޼ҵ尡 �ڽ� Ŭ�������� �������̵��Ǿ��ٸ� �ڽ� Ŭ������ �޼ҵ尡 ��� ȣ��ȴ�.

5. �׷��� ������ SnowTire�� run �޼ҵ尡 �� �� ����Ǿ� ���� ���� ����� ��µȴ�.
*/