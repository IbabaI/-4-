package ch01_If_02;

/*�ֻ���(dice) 1~6���� ���� �ֻ���*/
public class IfDiceExam01 {

	public static void main(String[] args) {
		
	/* �⺻Ÿ�� �ֻ���
		int num = 1;
	if(num==1) {
		System.out.println("1���� ���Ծ��ϴ�.");
	}else if(num==2) {
		System.out.println("2���� ���Ծ��ϴ�.");
	}else if(num==3) {
		System.out.println("3���� ���Ծ��ϴ�.");
	}else if(num==4) {
		System.out.println("4���� ���Ծ��ϴ�.");
	}else if(num==5) {
		System.out.println("5���� ���Ծ��ϴ�.");
	}else if(num==6) {
		System.out.println("6���� ���Ծ��ϴ�.");
	}            
	  */
		
		// 1~6���� ���� �ȿ��� �����ϰ� ������ �ϴ� �ҽ��ڵ�
		int num = 5;
		// 0+1<=(int)(Math.random()*6)+1; <6+1
		
		num =(int)(Math.random()*6)+1;  //1,2,3,4,5,6 �� ���
		
		if(num==1) {
			System.out.println("1���� ���Ծ��ϴ�.");
		}else if(num==2) {
			System.out.println("2���� ���Ծ��ϴ�.");
		}else if(num==3) {
			System.out.println("3���� ���Ծ��ϴ�.");
		}else if(num==4) {
			System.out.println("4���� ���Ծ��ϴ�.");
		}else if(num==5) {
			System.out.println("5���� ���Ծ��ϴ�.");
		}else if(num==6) {
			System.out.println("6���� ���Ծ��ϴ�.");
		}            

	}

}