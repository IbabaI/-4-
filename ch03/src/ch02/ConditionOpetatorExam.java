package ch02;

public class ConditionOpetatorExam {

	public static void main(String[] args) {


		int x=5;
		int y=3;
		
		int s;
		if(x>y) s=1;  //(x>y) ������� s�̴�
		else s=-1;
				
		System.out.println(s);
		
		//���׽��� �̿��� ó��
		s = x>y ? 1:-1;
		System.out.println(s);

	}

}
