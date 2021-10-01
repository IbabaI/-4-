package ch05_enum;

import java.util.Scanner;

public class EnumMethodExam01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//name()�޼ҵ�
		Week today = Week.SUNDAY;
		String name = today.name(); //����Ÿ�Ի�� ->StringŸ������ ��ȯ
		System.out.println(name);
		
		//ordinal()�޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo()�޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // 0 - 2
		int result2 = day2.compareTo(day1); // 2 - 0
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()�޼ҵ� : String -> ����
		System.out.println("������ ���Ż�� �������� �Է����ּ���");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay); //��ĳ�ʷ� �Է¹��� ���ڿ��� -> Week����� ��ȯ
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
		    System.out.println("�ָ��̱���");
		}else {
			System.out.println("�����̱���");
		}
		
		//vaules()�޼ҵ�
		
		Week[] days = Week.values();
		for(int i=0; i<days.length; i++)
			System.out.println(days[i]+" ");
		    System.out.println();
		
		// ���� for��
		 for(Week d:days)
			 System.out.println(d+" ");

	}

}