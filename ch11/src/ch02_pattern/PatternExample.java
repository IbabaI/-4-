package ch02_pattern;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		String regExp="(02|010)-\\d{3,4}-\\d{4}"; //������(02Ȥ�� 010)-123,1234-4567
		String data = "010-124-4567";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {//
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		//������ email 123hon@naver.com, hong123@naver.co.kr
		regExp="\\w+@\\W+\\.\\w+(\\.\\w+)?";
		data = "anger@namver.com";
		result=Pattern.matches(regExp, data);
		System.out.println(result? "email �����Դϴ�.":"email������ �ƴմϴ�.");

	}

}
