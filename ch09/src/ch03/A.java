package ch03;

public class A {

	//�ʵ带 �����ϰ� �ڽ�(����ü)���� �ʱ�ȭ
	Parent p = new Child(); //promotion
	
	void method() {
		//����ü���� �߰��� ����� �θ�Ÿ������ ��ȯ�� ���� �Ұ�
//		p.childF=3;
//		p.childM();
		
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ�� �θ�Ÿ������ ��ȯ�� ���� ���� - �����ǵ� �������� ����
		p.parentmethod();
	}
	//�����������̽� ����
	//����ü(���)�� ���� ParentŸ������ promotion�� ����
	Parent p2 = new Parent() {
       
		//����Ŭ�������� �߰��� ���
		int childF; //�ʵ�
		void childM() {}//�޼ҵ�
		
		@Override
		public void parentmethod() {
			childF=3;
			childM();
			
		}
		
	};
	
	void method2() {
		p2.parentmethod();
	}
}
