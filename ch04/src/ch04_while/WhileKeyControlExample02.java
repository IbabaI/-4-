package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample02 {

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
			//'0'�� int���� 48 49-48=1, 50-48=2 ,51-48=3
			keycode = System.in.read()-'0'; //Ű����� ���� �Է�
			System.in.read(); // \r = 13
			System.in.read(); // \n =10
			
			
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
