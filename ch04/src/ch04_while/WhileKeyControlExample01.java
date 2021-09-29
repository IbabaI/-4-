package ch04_while;

import java.io.IOException;

public class WhileKeyControlExample01 {

	public static void main(String[] args) throws IOException {
		
		boolean run=true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode !=13 && keycode!=10) { //Enter키가 아니면
				System.out.println("-------------");
				System.out.println("1.중속 | 2.감속 | 3.중지: ");
				System.out.println("-------------");
				System.out.println("선택");
				
			}
			keycode = System.in.read(); //키보드로 부터 입력
			
			if(keycode==49) {  //"1"
				speed++;
				System.out.println("현재 속도="+speed);
			} else if(keycode==50) {// "2"
					speed--;
					System.out.println("현재 속도="+speed);
			} else if(keycode==51) { //"3"
				run = false;
				
		
		
		}// while 끝
			System.out.println("end");

	}
	}
}
