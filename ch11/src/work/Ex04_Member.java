package work;

public class Ex04_Member {
	
	/*MemberŬ������ �ۼ��ϵ�, Object�� toString()�޼ҵ带 �������̵��ؼ� MemberExampleŬ������ ������ó��
�������� �ۼ��غ�����.*/

	private String id;
	private String name;
	
	public void Member(String id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		
		return id + ":" +name;
	}
	
	//���⼭ �ڵ带 �ۼ��ϼ���
	

}
