package work;

public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("���� ���ڿ����� \"�ڹ�\"���ڿ��� ���ԵǾ� �ִ��� Ȯ���ϰ�, \"�ڹ�\"�� Java�� ��ġ��\r\n"
				+ "���ο� ���ڿ��� ��������.");
		
	
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�"); //�ش繮����ġ index�� ����, -1
		
		
		if(index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		}else { 
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "Java");
			System.out.println("->" + str);
			
		}
		
		//���ప  : �ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�. -> ��� ���α׷��� Java ���� ���ߵ� �� �ִ�.

	}

}
