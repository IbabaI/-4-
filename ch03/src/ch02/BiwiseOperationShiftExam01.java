package ch02;

public class BiwiseOperationShiftExam01 {

	public static void main(String[] args) {
		
		byte c = 20; //0x14
		byte d = -8; //0xf8
		
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2); //c값을 2비트 왼쪽 시프트
		System.out.println(c>>2); //c값을 2비트 오른쪽 시프트, 왼쪽에 최상위 비트 0삽입(양수)
		System.out.println(d>>2); //d값을 2비트 오른쪽 시프트, 왼쪽에 최상위 비트 1삽입(음수)
		
		System.out.printf("%04x\n", d); //시프트 이전의 값 00   f      8
		                                //                 1111  1000  -> 아래 값으로 변환하면 (00삽입)0011 1110(00삭제)
		System.out.printf("%04x\n",(int)d); 
		//  f    f     f    f     f    f      f    8
		// 1111 1111  1111 1111  1111 1111  1111 1000 (int)로 변환된 원래 값
		// 아래값으로 변환 시키려면 맨왼쪽에 00삽입, 2칸씩 밀리고 맨 오른쪽에 00삭제 
		
		System.out.printf("%x\n", (d>>>2)); //d를 2비트 오른쪽 시프트, 왼쪽에 무조건 0이 삽입됨
        //  3    f       f    f      f   f       f    e => 3 15 15 15 15 15 15 14
		// 0011 1111   1111 1111   1111 1111    1111 1110 
		System.out.printf("%x\n", (byte)(d>>>2));
		
		
	}

}
