package work;

public class Ex15 {

	/*MemberService - boolean login("hong","12345"), <- id, password,��� true, false
	 * void logout("id"),  <-�α׾ƿ��Ǿ����ϴ�. 
	 * */
	
	public static void main(String[] args) {
		
		/*MemberService Ŭ������ login()�޼ҵ�� logout()�޼ҵ带 �����Ϸ��� �մϴ�.
login()�޼ҵ带 ȣ�� �� ������ �Ű������� id�� password�� �����ϰ�, logout()�޼ҵ��
id�� �Ű������� �����մϴ�. MemberService Ŭ������ login(),logout()�޼ҵ带 �����غ�����.

1) login() �޼ҵ�� �Ű��� id�� "hong", �Ű��� password�� "12345"�� ��쿡�� true��
�����ϰ� �� �̿��� ���� ��쿡�� false�� �����ϵ��� �ϼ���
2) logout()�޼ҵ��� ������ "�α׾ƿ� �Ǿ����ϴ�"�� ��µǵ��� �ϼ���

����Ÿ��           �޼ҵ� �̸�             �Ű�����(Ÿ��)
boolean           login         id(String), password(String)
void              logout              id(String)*/

		
		MemberService memberService=new MemberService();
		boolean result = memberService.login("hong","12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
class MemberService {
	boolean login(String id, String password) {
		boolean result=false;
		if(id.equals("hong")&&password.equals("12345"))
			result=true;
		else
			result=false;
		return result;
	}
	void logout(String id) {
		if("hong".equals(id))
			System.out.println(id+"�� �α׾ƿ��Ǿ����ϴ�.");
	}
}