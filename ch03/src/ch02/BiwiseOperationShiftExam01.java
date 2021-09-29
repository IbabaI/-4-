package ch02;

public class BiwiseOperationShiftExam01 {

	public static void main(String[] args) {
		
		byte c = 20; //0x14
		byte d = -8; //0xf8
		
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2); //c���� 2��Ʈ ���� ����Ʈ
		System.out.println(c>>2); //c���� 2��Ʈ ������ ����Ʈ, ���ʿ� �ֻ��� ��Ʈ 0����(���)
		System.out.println(d>>2); //d���� 2��Ʈ ������ ����Ʈ, ���ʿ� �ֻ��� ��Ʈ 1����(����)
		
		System.out.printf("%04x\n", d); //����Ʈ ������ �� 00   f      8
		                                //                 1111  1000  -> �Ʒ� ������ ��ȯ�ϸ� (00����)0011 1110(00����)
		System.out.printf("%04x\n",(int)d); 
		//  f    f     f    f     f    f      f    8
		// 1111 1111  1111 1111  1111 1111  1111 1000 (int)�� ��ȯ�� ���� ��
		// �Ʒ������� ��ȯ ��Ű���� �ǿ��ʿ� 00����, 2ĭ�� �и��� �� �����ʿ� 00���� 
		
		System.out.printf("%x\n", (d>>>2)); //d�� 2��Ʈ ������ ����Ʈ, ���ʿ� ������ 0�� ���Ե�
        //  3    f       f    f      f   f       f    e => 3 15 15 15 15 15 15 14
		// 0011 1111   1111 1111   1111 1111    1111 1110 
		System.out.printf("%x\n", (byte)(d>>>2));
		
		
	}

}
