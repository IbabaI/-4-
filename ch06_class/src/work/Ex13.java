package work;

public class Ex13 {  //ex14 ���� �ذ��

	public static void main(String[] args) {
		

		System.out.println("���� ������ ȸ���� MemberŬ������ �𵨸��Ϸ��� �մϴ�. ȸ���� �����ͷδ� \r\n"
				+ "�̸�,���̵�, �н�����, ���� �� �ֽ��ϴ�. �� �����͵��� ������ MemberŬ������ �����غ�����.");
		
		/*
		 * ������ �̸�            �ʵ� �̸�             Ÿ��
            �̸�                 name               ���ڿ�
            ���̵�                id                 ���ڿ�
           �н�����              password            ���ڿ�
            ����                 age                 ����
		  */
		Member user1 = new Member("ȫ�浿","hong");
		Member user2 = new Member("���ڹ�","java");//default�����ؾ� ��밡��
		
		user2.setId("java");
		user2.setName("���ڹ�");
	}

}
class Member{
	//�ʵ�
	private String name;
	private String id;
	private String password;
	private int age;
	
	//������ -Ex14
	  public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	  //default����
	  public Member() {	}
	  
	//�޼ҵ�
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}