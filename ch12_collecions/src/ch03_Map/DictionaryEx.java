package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {

	public static void main(String[] args) {
		
		// "apple"-"���", "pear"-"��","peach"-"������",
		// "puppy"-"������", "cow"-"��", "zebra"-"��踻", "chicken"-"��"
		// Map�� ���� �� 
		// scanner�� ������ �Է¹޾Ƽ� �ش��ϴ� �ѱ��� ���
		// Map�� Ű�� ������ �ٽ� �Է��ϵ��� 
		// �������� "end"�� �ԷµǸ� ����;
		
		Scanner scanner = new Scanner(System.in);
		
		//�ʿ� ����
		Map<String,String> dictionary =new HashMap<>();
		dictionary.put("apple","���");
		dictionary.put("pear","��");
		dictionary.put("peach","������");
		dictionary.put("puppy","������");
		dictionary.put("cow","��");
		dictionary.put("zebra","��踻");
		dictionary.put("chicken","��");
		
	
		while(true) {
		//��ȸ�� �ܾ�
		System.out.println("��ȸ�� ���ܾ� �Է��ϼ���> ");
		String key = scanner.next();
		if(!key.equals("end")) {
	   	 if(dictionary.containsKey(key)) {
			System.out.println(dictionary.get(key));
		}else {
			System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
		}
	   }else
		   break;
	 }System.out.println("����");

	}

}
