package ch04_while;

import java.io.IOException;

public class While04 {

	public static void main(String[] args) {
		
		System.out.println("2~9������ ���ڸ� �Է��ϼ���");
		//Ű����� ���� 0�� ������ �ԷµǴ� ����? 48 <-ASCII�ڵ� ��
	try { 
		int num = System.in.read()-'0'; // ǥ���Է� ��Ʈ�� '0'Ű�� ������� : 48-48 => '1'Ű�� ������� 49-48
		System.out.println("������"+num +"��");
		int i=1;
		while(i<=9) { //while����{}�� ���������� ����
			System.out.println(num+"*"+i+"="+(i*num)); //���
			i++; // ���� ���ɹ�
		}
		
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("�����߻�");  //���������� ���� try catch�� ���
		}
}
}