package work;

public class Ex05 {

	
	/*������ Action �������̽��Դϴ�. work()�߻� �޼ҵ�� ��ü�� �۾��� ���۽�ŵ�ϴ�.

public interface Action {
    void work();
}

ActionExample Ŭ������ main()�޼ҵ忡�� Action�� �͸� ���� ��ü�� ����� ������ ���� ���� �����
���� �� �ֵ��� �ڽ� �ȿ� �� �ڵ带 �ۼ��غ�����.
	 * 
	 * */
	public static void main(String[] args) {
		
		//primotion (�ڽ� -> �θ�)
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

// ����� : ���縦 �մϴ�.