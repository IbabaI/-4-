package work;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

/*���� ������� 10/4��(��) 23:59�� ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 * */

public class Work01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String personal=scanner.next();
		boolean run = true;
		String se,age,height,weight;	
		int cnt=0;
		double sum = 0;
		
		while(run) {
			System.out.println("==============================");
			System.out.println("1.����|2.����|3.Ű|4.������|5.����");
			System.out.println("==============================");
			System.out.println("����>");
			int menu = scanner.nextInt();
			      
			switch(menu) {
			
			case 1:
			 System.out.println("����>");
			 se=scanner.next();
			 
			 
			case 2:
			 System.out.println("����>");
			 age=scanner.next();
			 
			case 3:
			 System.out.println("Ű>");
			 height=scanner.next();
			
			case 4:
			 System.out.println("������>");
			 weight=scanner.next();
			 break;
			case 5:
			    run = !run;  break;
			}break;
		}
		
		
    
		while(run) {
			
			final double ST1 = 1.10;
			final double ST2 = 128;
			if(cnt==5)
				
			
			System.out.println(cnt+"ȸ �����Ͽ����ϴ�. ���α׷��� �ٽ� �����մϴ�");
		   	
			   System.out.println("Ű�� �����Ը� �Է��ϼ���.");
			   System.out.println("Ű>");
			   double num1=scanner.nextDouble();
			   
			   System.out.println("������>");
			   double num2=scanner.nextDouble();
			   
			    
			 
			   System.out.println("�����淮: "+fat);
			   if(ST1 * num2 - (ST2 * (num2 * num2) / (num1 * num1)));
			   fat += scanner.nextInt(); 
           
			
		
		
		
	/*	// �����淮 ���ϱ�
		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		//�����淮
		double result = ST1 * weight - ST2 * 
			((weight * weight) /(double)(height * height)); 

		System.out.println(result);

		// ü���淮 ���ϱ�
		double result2 = weight - result;

		System.out.println(result2);

		// ü����� ���ϱ� = ü���淮*100/ü��
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;
				
		 System.out.println(result3);
		 */
		}
		}
}



