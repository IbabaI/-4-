package ch02_switch;



public class SwitchExam03 {

	public static void main(String[] args) {
		
		// ������, ȭ����, ������, �����, �ݿ���, �����, �Ͽ���
		// 1   ,  2  ,  3  ,  4   ,  5  , 6   ,  0
		// ��~�����(1~4) : Ȯ���� ������ �����մϴ�.
		// �ݿ���(5) : ������ �մϴ�.
		// �����, �Ͽ���(6,0) : ������ ���ϴ�.
		// random()�̿��ؼ� ���� �޾Ƽ� ���
		
		int weekDay =(int)(Math.random()*7); //0<= <7
		System.out.println(weekDay);
		
		
		switch(weekDay) {
		//��~����� : Ȯ���� ������ �����մϴ�.
		// �ݿ��� : ������ �մϴ�.
		// �����, �Ͽ��� : ������ ���ϴ�.
		case 1:  
		    System.out.println("������ - Ȯ���� ������ �����մϴ�."); break;		    
		case 2:  
		    System.out.println("ȭ���� - Ȯ���� ������ �����մϴ�."); break;		    
		case 3:  
		    System.out.println("������ - Ȯ���� ������ �����մϴ�."); break;		    
		case 4: 
		    System.out.println("����� - Ȯ���� ������ �����մϴ�."); break;
		case 5: 
			System.out.println("�ݿ��� - ������ �մϴ�"); break;
		  
		case 6: System.out.println("����� - ������ ���ϴ�"); break;
		case 0:
			System.out.println("�Ͽ��� - ������ ���ϴ�"); break;
          
		
		}
		
		
	}

}
