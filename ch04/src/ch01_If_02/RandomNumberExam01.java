package ch01_If_02;

public class RandomNumberExam01 {

	public static void main(String[] args) {
		
		// 0<= Math.random()출력범위 < 1 위 난수 출력
		// 0.0*10<= Math.random()*10 < 1*10
		// 0.0<= Math.random()*10 < 10
		// int(0.0)<=(int)(Math.random()*10) < (int)10
		
	//	double ran=Math.random();
	//	System.out.println(ran); // 실핼할 때 마다 값이 달라진다.
		
	//	double ran=Math.random()*10;
	//	System.out.println(ran);
		
		double ran=(int)(Math.random()*10); // 0.0<= 범위 <10.0
		System.out.println(ran);
		

		int ranI =(int)(Math.random()*10); //0<= 범위 < 10 : 0~9
		System.out.println(ranI);
		
		// 자연수 범위의 난수 출력시
		//(int)(Math.random()*범위)+1
		int ranIi =(int)(Math.random()*10)+1; //0+1<= 범위 +1 < 10+1 : 0~9+1
		System.out.println(ranIi);
	}

}
