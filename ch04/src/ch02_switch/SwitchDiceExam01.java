package ch02_switch;

/*�ֻ���(dice) 1~6���� ���� �ֻ���*/
public class SwitchDiceExam01 {

	public static void main(String[] args) {
		
	
		
		int num;
		
		
		num =(int)(Math.random()*6)+1;  //1,2,3,4,5,6 �� ���
		
		switch(num) { //���� //switch���� �������� ���� ���´�
		case 1:System.out.println("1���� ���Ծ��ϴ�.");
		    break;// switch���� ���������� ��ɹ�
		case 2:System.out.println("2���� ���Ծ��ϴ�."); 
		    break;
		case 3:System.out.println("3���� ���Ծ��ϴ�."); 
		    break;
		case 4:System.out.println("4���� ���Ծ��ϴ�."); 
		    break;
		case 5:System.out.println("5���� ���Ծ��ϴ�."); 
		    break;
		case 6:System.out.println("6���� ���Ծ��ϴ�.");  
		    break;
		default:System.out.println(num+"���� ���Ծ��ϴ�.");
		}            

	}

}
