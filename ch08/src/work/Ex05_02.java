package work;

/*���� �������̽�*/
public class Ex05_02 {

	public static void main(String[] args) {
		
		//�� ���α׷������� 1ȸ������ �������̽��� �����ؼ� ��üŬ������ ����ϰ� �����ڴ�.
		//�̸����� ��ü Ŭ������ ���� �������̽��� ���� �� ���
		//�������̽��� ���� �̸��� �����ڸ� ȣ���Ͽ� ���� �ϸ� ��ü Ŭ������ ����,
		//�� ������ ��ü�� ActionŸ�Կ� ����
		Action action = new Action() { //�ڽ�(��üŬ������ ��ü)�� ���� �θ�Ÿ�Կ� ����(promotion)

			@Override
			public void work() { //����Ŭ�������� �����ǿ� ����
				System.out.println("���縦 �մϴ�.");
				
			}
			
		};
		action.work();		
		
		// ���� �������̽�(anonymous inner type)
		action = new Action() {

			@Override
			public void work() {
				System.out.println("����۾�.");
				
			}
			
		};
		action.work();	
	
}
}

