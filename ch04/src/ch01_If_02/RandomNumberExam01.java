package ch01_If_02;

public class RandomNumberExam01 {

	public static void main(String[] args) {
		
		// 0<= Math.random()��¹��� < 1 �� ���� ���
		// 0.0*10<= Math.random()*10 < 1*10
		// 0.0<= Math.random()*10 < 10
		// int(0.0)<=(int)(Math.random()*10) < (int)10
		
	//	double ran=Math.random();
	//	System.out.println(ran); // ������ �� ���� ���� �޶�����.
		
	//	double ran=Math.random()*10;
	//	System.out.println(ran);
		
		double ran=(int)(Math.random()*10); // 0.0<= ���� <10.0
		System.out.println(ran);
		

		int ranI =(int)(Math.random()*10); //0<= ���� < 10 : 0~9
		System.out.println(ranI);
		
		// �ڿ��� ������ ���� ��½�
		//(int)(Math.random()*����)+1
		int ranIi =(int)(Math.random()*10)+1; //0+1<= ���� +1 < 10+1 : 0~9+1
		System.out.println(ranIi);
	}

}
