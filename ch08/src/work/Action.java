package work;

public interface Action {
    void work();
}

class BookAction implements Action{

	@Override
	public void work() {
		System.out.println("������ ����մϴ�.");
		
	}
	
}
class CheckInAction implements Action {

	@Override
	public void work() {
		System.out.println("������ �뿩�մϴ�.");
		
	}
	
}
class CheckOutAction implements Action {

	@Override
	public void work() {
		System.out.println("������ �ݳ��մϴ�.");
		
	}
	
}