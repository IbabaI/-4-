package work;

public interface Action {
    void work();
}

class BookAction implements Action{

	@Override
	public void work() {
		System.out.println("도서를 등록합니다.");
		
	}
	
}
class CheckInAction implements Action {

	@Override
	public void work() {
		System.out.println("도서를 대여합니다.");
		
	}
	
}
class CheckOutAction implements Action {

	@Override
	public void work() {
		System.out.println("도서를 반납합니다.");
		
	}
	
}