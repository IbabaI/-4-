package ch01;

public class DenyLogicOperatorExamle {

	public static void main(String[] args) {
		
		boolean play = true;
		
		System.out.println(play);
		
		play = !play;  // !ture -> not ture -> false
		System.out.println(play);
		
		play = !play; //false -> not false ->ture
		System.out.println(play);
		
		int i=0;
		while(play) { //true -> false
				i++; //����
		System.out.println("hello");

		if(i==5) play = !play;//�ݺ��� ���������� ���� ���
		
	}
	
	   
	 System.out.println("����");
   }

}
