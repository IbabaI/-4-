package ch03;

public interface Parent {
   void parentmethod();
}

class Child implements Parent{
	//����Ŭ�������� �߰��� ���
	int childF; //�ʵ�
	void childM() {}//�޼ҵ�
	//����Ŭ�������� �����ǵ� �޼ҵ� - ���� �������̽����� ����Ǿ��ִ� �޼ҵ�
	@Override
	public void parentmethod() {
		childF=3;
		childM();
		
	}
	
}
