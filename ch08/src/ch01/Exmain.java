package ch01;

public class Exmain {

	public static void main(String[] args) {
		
		//�������̽��� ��ü�� ���� �� ���� Ŭ����
	//	RemoteControl01 rc = new RemoteControl01();

		//������ ��ü Ŭ������ ��ü�� �������̽��� ����
		RemoteControl rc = new TVRemoteControl();
		//�������̽��� �޼ҵ� ȣ��
		//������ ��ü Ŭ������ �����ǵ� �޼ҵ� ������ ����
		rc.method();
	}

}
