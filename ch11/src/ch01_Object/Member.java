package ch01_Object;

public class Member {
	//thread, collection, network, file�����
	public String id;
		
	public Member(String id) {
		this.id = id;
	}
	//Object�� ���� ��ӹ��� equals�޼ҵ带 �������Ͽ� ������ ���� ���� �����
		@Override
		public boolean equals(Object obj) {
			//�񱳽�
			//���� Ÿ���� �ƴϸ� false
			if(obj instanceof Member) {
				//���� Ÿ���̸� id�� ���� ���� ��� true/false
            Member other=(Member)obj;
            return this.id.equals(other.id);
//			return this.id.equals(((Member)obj).id);
			}
			return false;		
	}
}