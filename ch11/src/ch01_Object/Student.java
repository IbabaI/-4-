package ch01_Object;

public class Student {
	//thread, collection, network, file�����
	public String id;
		
	public Student(String id) {
		this.id = id;
	}
	
	//Object�� ���� ��ӹ��� equals�޼ҵ带 �������Ͽ� ���� ���� ���� �����
	@Override
	public boolean equals(Object obj) {
		//�񱳽�
		//���� Ÿ���� �ƴϸ� false
		if(obj instanceof Student) {
			//���� Ÿ���̸� id�� ���� ���� ��� true/false
		return this.id.equals(((Student)obj).id);
		}
		return false;
	}
}
