package ch07_singleton02;

/*�̱������� Ŭ���� ����*/
public class SingleTon {
	// 1.�ڽ�Ÿ���� static�ʵ� ����
	static SingleTon instance=new SingleTon();
	
	// 2.�����ڸ� �ܺο��� ���� ���ϰ� private�� ó��
	private SingleTon() {}
	
	// 3.public���� �����ϵ��� �޼ҵ� ����
	public static SingleTon getInstance() {
		if(instance==null) instance=new SingleTon();
		return instance;
	}

	
	
}
