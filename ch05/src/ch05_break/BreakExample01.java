package ch05_break;

import java.util.Scanner;

public class BreakExample01 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(true) {
			System.out.println(">>");
			String text=scanner.nextLine();// �� �� ������ ���ڿ��� �Է¹޴� �޼ҵ�
			
			System.out.println("�Է°�:" +text);
		//����ϸ� ����� �ȳ���	if(text=="exit")//"exit"�� �ԷµǸ� �ݺ� ����
		//����	if(text.equals("exit"));  //�����	
			if("exit".equals(text)) // exit ���ͷ��� String��ü�� �� -> ��ü�� �޼ҵ带 ����
			
			break;
		}
		System.out.println("�����մϴ�.");
		scanner.close();

	}

}
