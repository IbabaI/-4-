package work;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

/*���� ������� 10/4��(��) 23:59�� ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 * 
 * 1. ǥ�� �����淮 ��� 
 * ����ǥ�� = (1.10 * ü��kg ) - ( 128 * ( ü��kg���� / Űcm���� ) )
 * ����ǥ�� = (1.07 * ü��kg ) - ( 128 * ( ü��kg���� / Űcm���� ) )
 * 
 * 2. ǥ�� ü���淮 ��� ü���淮kg = ü��kg - �����淮kg
 * 
 * 3.ǥ�� ������� ��� -> �������% = (�����淮kg * 100 ) / ü��kg
 * 
 * 4. ǥ�� ü����� ��� 
		 * 1) ü�����% = 100 - �������% 
		 * 2) ü�����% = (ü���淮kg * 100 ) / ü��kg
 * */

public class Work02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String personal=scanner.next();
		boolean run = true;
		
		int cnt=0;
		double sum = 0;
		
		while(run) {
			String se,age,height,weight;	
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
			System.out.println("�����淮 ���ϱ�>");
			
			
			double height = 0;
			double weight = 0;
			double fat1 = 0;
			double fat2 = 0;
			double fat3 = 0;
			double fat4 = 0;
	        final double ST1 = 1.10;
	        final double ST2 = 128;
			   System.out.println("Ű�Է�>");
			   height=scanner.nextDouble();
			   
			   System.out.println("�������Է�>");
			   weight=scanner.nextDouble();
			   
			   fat1= ST1 * weight - (ST2 * ((double) (weight * weight) / (height * height))); 
			 
			   System.out.println("�����淮: "+fat1);
			  
			   fat1 += scanner.nextInt(); 
			  
			   
			   System.out.println("ü���淮 ���ϱ�>");
		       fat2= weight - fat1;
		       
		       System.out.println("ü���淮: "+fat2);
				  
			   fat2 += scanner.nextInt(); 
		
			   
			   
			   System.out.println("������� ���ϱ�>");
		       fat3= (fat1 * 100 ) / weight;
		       
		       System.out.println("�������: "+fat3+"%");
				  
			   fat3 += scanner.nextInt();
			   
			   
			   
			   System.out.println("ü����� ���ϱ�>");
		       fat4 = (fat2*100)/weight;
		       
		       System.out.println("ü�����: "+fat4+"%");
		       
				  
			   fat4 += scanner.nextInt();
			   
			   break;
			   
		
		}
	}
}



