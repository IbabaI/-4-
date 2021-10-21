package ch01_Object_finalize;

public class FinalizeEx {

	public static void main(String[] args) {
		
		Counter counter = null;
		
		long startTime = System.currentTimeMillis();
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			// ���������� ��ü ��������
			counter = null;
			// gcȣ��
			System.gc();
		}//GC�� �޸��� ��� ������ ��ü�� �Ҹ����� ����, GC�� ���� ������ �������� ����


		long endTime = System.currentTimeMillis();
		System.out.println("�ҿ�ð�: "+(endTime-startTime)+"ms");
	}

}