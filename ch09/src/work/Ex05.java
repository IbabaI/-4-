package work;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println("AnonymousExample Ŭ������ ���� ����� ���� Vehicle�������̽��� �͸� ���� ��ü�� �̿��ؼ� �ʵ�, ���� ������\r\n"
				+ "�ʱⰪ�� �޼ҵ��� �Ű����� �����غ�����.");
		
		 Anonymous anony = new Anonymous();
		   anony.field.run();
		   anony.method1();
		   anony.method2(
		   new Vehicle() {
				   @Override
				   public void run() {
					   System.out.println("Ʈ���� �޸��ϴ�.");
				   }

		   }
		  );

	}

}
