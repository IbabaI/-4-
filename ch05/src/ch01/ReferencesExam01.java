package ch01;

public class ReferencesExam01 {

	public static void main(String[] args) {
		
		//���ͷ��� ���ڿ� ���� - ���ͷ� Ư���� ������
			String strA = "ȫ�浿";
			String strB = "ȫ�浿";
			if(strA==strB)System.out.println("���� ���ڿ��� �����Ѵ�");
			else System.out.println("�ٸ� ���ڿ��� �����Ѵ�");
				
			//new String() - �����ڷ� ���ڿ� ���� - ����Ÿ�� Ư���� �ٸ���
			// ����Ÿ���� ������ new Ŭ������();���� ����
			String str1=new String("ȫ�浿"); // ����Ÿ�� 
			String str2=new String("ȫ�浿"); // ����Ÿ��
			if(str1==str2)System.out.println("���� ���ڿ��� �����Ѵ�");
			else System.out.println("�ٸ� ���ڿ��� �����Ѵ�");
				
			str1 = "������";
			str2 = "ȫ�浿������";
			if(str1==str2)System.out.println("���� ���ڿ��� �����Ѵ�");
			else System.out.println("�ٸ� ���ڿ��� �����Ѵ�");

	}

}