package work;

import java.util.regex.Pattern;

public class Ex10 {

	public static void main(String[] args) {
		
		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		}else {
			System.out.println("Id�� ����� �� �����ϴ�.");
		}

	}
//���ప : Id�� ����� �� �����ϴ�.
}
