package work;

public class Ex07 {

	public static void main(String[] args) {
		
		try {
			login("white","12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

		try {
			login("blue","54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
public static void login(String id, String password) throws NotExistIDException, WrongPasswordExceprion{
	
	//id�� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
	if(!id.equals("blue")) {
		throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		
		
		
	}
	//password�� "12345"�� �ƴ϶�� WrongPasswordExceprion �߻���Ŵ
		if(!id.equals("12345")) {
		throw new WrongPasswordExceprion("�н����尡 Ʋ���ϴ�.");
			
	}
  }
}
