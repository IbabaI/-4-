package work;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Parent Ŭ������ ����ؼ� Child Ŭ������ ������ ���� �ۼ��ߴµ�, Child Ŭ������ �����ڿ��� ������ ������ �߻��߽��ϴ�. �� ������ �����غ�����.");
	}
	/* �θ�����ڿ� default�����ڰ� ��� ���� �߻� */	
	public class Parent {
		
        public String name;
		
        // public parent(){} //1��° ���
		public Parent(String name) {
			this.name = name;
		}
	}
public class Child extends Parent{
	private int studentNo;
	
	// �Ű����� 2��¥�� ������
	public Child(String name, int studentNo) {
//		this.name = name;  //�������� - ����
		super(name);  // ���� ������ 2��° ���
		this.studentNo = studentNo;
	}
}
}