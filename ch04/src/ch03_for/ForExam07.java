package ch03_for;

public class ForExam07 {

	public static void main(String[] args) {
		
		//�ʱ�ȭ �κ��̳� �����κп�  , �� ��ɹ��� ������ �� ����
		for(int i=1 , y= 1; i<10; i++ , System.out.println(y)) {  
			//for���� ���������� ������ true
			//(�����ϰ� �����ݷи� �Է� ����)
			
			System.out.println("hello");
			
			//for���� ���������� ������ �������� ó��{}
		if(i==10) break; //���� ���������� ��ɹ� break;
		y++;
		}
		System.out.println("end");

	}

}
