package work;

public class Ex05 {

	
	/*다음은 Action 인터페이스입니다. work()추상 메소드는 객체의 작업을 시작시킵니다.

public interface Action {
    void work();
}

ActionExample 클래스의 main()메소드에서 Action의 익명 구현 객체를 만들어 다음과 같은 실행 결과가
나올 수 있도록 박스 안에 들어갈 코드를 작성해보세요.
	 * 
	 * */
	public static void main(String[] args) {
		
		//primotion (자식 -> 부모)
		Action action = new BookAction(); 
		action.work();		
		//upcasting
		action = new CheckInAction(); 
		action.work();	
		//upcasting
		action = new CheckOutAction(); 
		action.work();	
		
		

	
}
}

// 결과값 : 복사를 합니다.