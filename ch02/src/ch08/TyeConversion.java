package ch08;

public class TyeConversion {

	public static void main(String[] args) {
		
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);
		System.out.println(10/4); //정수/정수 -> 정수
		System.out.println(10.0/4); // 정수/실수 -> 실수
		System.out.println((char)0x12340041); //A
		System.out.println((byte)(b+i)); //오버플로우  최소값 -128 최대값 127 범위를 벗어나서
		System.out.println((int)2.9 +1.8);  //2 + 1.8 -> 2.0 + 1.8 => 3.8
		System.out.println((int)(2.9+1.8)); // 4.7=> 4
		System.out.println((int)2.9 + (int)1.8); // 2 + 1 => 3

	}

}
