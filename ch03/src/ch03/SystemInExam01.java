package ch03;

public class SystemInExam01 {

	// ǥ�� �Է½�Ʈ������ �� �Է½� I/O���� �߻� ���ɼ� ����. - ���� ó��
	public static void main(String[] args) throws Exception{ //����ó�� ���� throws Exception �߰�
		
		//���� 126p~128p
		//ǥ�� �Է½�Ʈ������ �� �Է� �ޱ�
		System.out.print("�Է�:");
		int a = System.in.read();
		System.out.println("���:"+a);//Ű����� Ű�� �Է� �� ����Ű�� ����(����Ű = '\r' '\n'
		System.in.read();
		System.in.read();
		
		// System.in.read()-48 or '0'; == ����
		System.out.print("�Է�:");
		int num = System.in.read() - 48; // �ƽ�Ű�ڵ� - 48 -> 48-48 =0
		// int num=System.in.read()-'0';
		System.out.println("���:"+num);
		System.in.read();// \r
		System.in.read();// \n
		
		//(char)System.in.read(); == ����
		System.out.print("�Է�:");
		char char_=(char) System.in.read(); //�ƽ�Ű�ڵ� 'A' ->65(int) ->char 'A'b
		// int num = System.in.read()-'0';
		System.out.println("���:"+char_);
		
		// ��ĳ�� ��� ������ �� ����ϴ� �����.

	}

}
