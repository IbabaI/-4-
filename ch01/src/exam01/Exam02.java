package exam01;

public class Exam02 {

	/* �̰��� �ڹٴ� Ȯ�ι��� 2��*/
	public static void main(String[] args) {
		
		
		/* 1. �ڹ� ������ ���� ���� �� Ʋ�� ��  */
		System.out.println("1.������ �ϳ��� ���� ������ �� �ִ� int = 10;, 20;,30; �̷��� �ȵȴ�");
		System.out.println("2.������ ����ÿ� ���� Ÿ���� ���� ������ �� �ִ� - Ÿ�� ������");
		System.out.println("3.������ ������ ����� �߰�ȣ{}�ȿ����� ��밡�� - scope(����)");
		System.out.println("4.������ �ʱⰪ�� ������� ���� ���¿��� ���� �� �ִ� - �ݵ�� �ʱ�ȭ�ؾ� ���� �� �ִ�  - x");
		
		/* 2. �����̸����� ��� ������ �� ��� ����  */
		System.out.println("1. modelName");
		System.out.println("2. class - x(�����)");
		System.out.println("3. 6hour - x(���ڷν��ۺҰ�)");
		System.out.println("4. $value");
		System.out.println("5._age");
		System.out.println("6. int - x(�����)");
		
		
		/* 3. �ڹ��� �⺻Ÿ�� 8���� */
		System.out.println("����Ÿ�� : byte(1byte), char/short(2byte), int(4byte), long(8byte)");
		System.out.println("�Ǽ�Ÿ�� : float(4byte), double(8byte)");
		System.out.println("��Ÿ�� : boolean(1byte)");
	
		
		/* 4. Ÿ��, �����̸�(�ĺ���), ���ͷ�  */
		int age;
		age = 10;
		double price = 3.14;
		System.out.println("Ÿ�� int, ������ age");
		System.out.println("������ age, ���ͷ� 10");
		System.out.println("Ÿ�� double, ������ price, ���ͷ� 3.14");
				
		
		/* 5. �ڵ� Ÿ�� ��ȯ, ������ ����  */
		byte byteValue = 10;
		char charValue = 'A';
		int intValue = byteValue;
		    intValue = charValue;
		// ���� short shortValue = charValue;
		double doublevalue = byteValue;
		
		
		/* 6. ���� Ÿ�� ��ȯ(casting) ���� */
		int intVlaue =  10;
		 char charVlaue = 'A';
		 double doubleValue = 5.7;
		 String stringValue = "A";
		 
		 double var =(double)intValue; // (double)�� ��� ��
		 byte var1 = (byte)intValue; // ���� �߸� �� ����
		 int var2 = (int)doubleValue;
		 // ���� char var3 = (char)strValue;  //char�� �⺻Ÿ�� - String�� ����Ÿ��
		 
		 
		 /*7.������ �� �� �ʱ�ȭ �Ѱ���*/
		 int var11 = 10; //int
		 long var12 = 10000000L;  //long
	//����	 char var13 = ''; 
		 double var14 = 10; //int -> double
		 float var15 = 10; // int -> float
		 
		 
		 /*8.����Ŀ��� Ÿ�Ժ�ȯ ����. ������ ����*/
		 byte byteValue1 = 10;
		 float floatValue1=2.5F;
		 double doubleValue1=2.5;
		 
		 //java�� Ư���� byteŸ���� ������ ����� int Ÿ������ ��ȯ�Ͽ� ���꿡 ������.
		 //byte, short, shar -> intŸ������ ��ȯ�Ͽ� ���꿡 �����ϵ��� ����Ǿ���.
		 // 58������ ��ܺκ� Ȯ��
		 //����  byte result1 = byteValue + byteValue; ---> byte + byte => int + int => int
		 int result2 = 5 + byteValue1; // int + byte => int
		 float result3 = 5 + floatValue1; // int + float => float
		 double result4 = 5 + doubleValue1; // int + double => double
		 
		 
		 
		 


	}

}
