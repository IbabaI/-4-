package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample01 {

	public static void main(String[] args) throws IOException {
		
		boolean run=true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode !=13 && keycode!=10) { //EnterŰ�� �ƴϸ�
				System.out.println("-------------");
				System.out.println("1.�߼� | 2.���� | 3.����: ");
				System.out.println("-------------");
				System.out.println("����");
				
			}
			keycode = System.in.read(); //Ű����� ���� �Է�
			
			if(keycode==49) {  //"1"
				speed++;
				System.out.println("���� �ӵ�="+speed);
			} else if(keycode==50) {// "2"
					speed--;
					System.out.println("���� �ӵ�="+speed);
			} else if(keycode==51) { //"3"
				run = false;
				
		
		
		}// while ��
			System.out.println("end");

	}
	}
}
