package work;
//������Ǯ��
public class Ex04_Member2 {
	
	public static void main(String[] args) {
		
		/*MemberŬ������ �ۼ��ϵ�, Object�� toString()�޼ҵ带 �������̵��ؼ� MemberExampleŬ������ ������ó��
		�������� �ۼ��غ�����.*/
		
	    Member member = new Member("blue","���Ķ�");
		System.out.println(member.toString());

		
	}
}
class Member{
	

	private String id;
	private String name;
	
	public  Member(String id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		
		return id + ":" +name;
	}
	
	//���⼭ �ڵ带 �ۼ��ϼ���
	

}
