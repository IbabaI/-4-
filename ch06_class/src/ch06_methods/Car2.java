package ch06_methods;

public class Car2 {
//메소드
	int gas;
	//리턴타입 없는 메소드에서 return문은 메소드를 종료한는 역할 - 결과를 되돌려주는 것은 아님
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량: "+gas+")");
				gas--;
			}else { 
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return; //메소드종료
			}
		}
	}
}
