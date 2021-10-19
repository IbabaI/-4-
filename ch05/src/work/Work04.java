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
		 * 
		 * 
		 * ������ Ǯ��
 * */

public class Work04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final double maleSTD = 1.10, femaleSTD=1.07;
		final int COMSTD =128, COMSTD2=100;
		boolean run=true;
		
		while(run) {
			System.out.println("==============================");
			System.out.println("��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� �ٶ��ϴ�");
			System.out.println("==============================");
			System.out.println("����(����(M)/����(F)�Է�)> ");
			int gender = scanner.nextInt();
			System.out.println("����(���� : 10~39 �Է�)> ");
			int age = scanner.nextInt();
			System.out.println("Ű �Է�(����:cm)> ");
			double height =scanner.nextDouble();
			System.out.println("������ �Է�(����:kg)> ");
			double weight = scanner.nextDouble();
			
			
		
    
		// 1. �����淮 ���ϱ�
			double leanBodyMass=0.0;
			switch(gender) {
			case 'M' : leanBodyMass=(maleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
			case 'F' : leanBodyMass=(femaleSTD*weight) - (COMSTD*((weight*weight)/(double)(height*height)));
			}
		    
		// 2. ü���淮 ���ϱ�(= ü�� - �����淮)
			double bodyFatMass = 0.0;
			bodyFatMass = weight - leanBodyMass;
			
		// 2-1. �������(=�����淮*100)/ü��	
			double leanBodyRatio = (leanBodyMass*COMSTD2)/(double)weight;
			
		// 3. ü����� ���ϱ�(=ü���淮*100/ü��)
			double bodyFatRatio = (bodyFatMass*COMSTD2)/(double)weight;
			
		// 4. �񸸵� ���
		//   �� /��
			String result="";
			switch(gender) {
			case 'M' : if(bodyFatRatio < 12) result ="���� ��";
			           else if(bodyFatRatio<=17) result ="ǥ��";
			           else if(bodyFatRatio<=22) result ="��ü��";
			           else if(bodyFatRatio<=27) result ="��";
			           else result ="����";
			        break;
			case 'F' : if(bodyFatRatio < 22) result ="���� ��";
	                   else if(bodyFatRatio<=27) result ="ǥ��";
	                   else if(bodyFatRatio<=35) result ="��ü��";
	                   else if(bodyFatRatio<=40) result ="��";
	                   else result ="����";
			}
			
			System.out.println("���: ");
			System.out.printf("�����淮:%.2f\n", leanBodyMass);
			System.out.printf("�������:%.2f\n", leanBodyRatio);
			System.out.printf("ü�����:%.2f\n", bodyFatMass);
			System.out.printf("�������:%.2f\n", bodyFatRatio);
			System.out.println("���: "+result);
			
			System.out.println("����ұ��?(yes/no)");
			String yesNO=scanner.next();
			if( yesNO.equals("no")) run =!run;
			}
		
		   System.out.println("���α׷� ����");
	}
}



