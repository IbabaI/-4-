package ch02_switch;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		
		// ������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���
		// ��~����� : Ȯ���� ������ �����մϴ�.
		// �ݿ��� : ������ �մϴ�.
		// �����, �Ͽ��� : ������ ���ϴ�.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ �Է����ּ���(ex:������):");
		String weekDay= scanner.next();
		String str="";
		switch(weekDay) {
		//��~����� : Ȯ���� ������ �����մϴ�.
		// �ݿ��� : ������ �մϴ�.
		// �����, �Ͽ��� : ������ ���ϴ�.
		case "������": 
		case "ȭ����": 
		case "������": 
		case "�����": 
		  str="Ȯ���� ������ �����մϴ�."; break;
		case "�ݿ���": 
		  str = "������ �մϴ�"; break;
		case "�����": 
		case "�Ͽ���":
          str="������ ���ϴ�"; break;
		default: str="���¿���";
		
		}System.out.println(" " +str);
		
		// ��ĳ�� ���� - �ֱ� ���������� ����Ŭ���� �Ǳ� ������ ���ص��ȴ�.
		scanner.close();
	}

}
