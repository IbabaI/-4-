package exam04_01;

import java.sql.SQLOutput;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Exam07_02 {

	public static void main(String[] args) {
		
	/* while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����,
	 * ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ��غ�����. 
	 * �� ���α׷��� ���� ��Ű�� ������ ���� ���� ����� ���;� �մϴ�. 
	 * 
	 * ------------------
	   1.����|2.���|3.�ܰ�|4.����
	   ------------------
	   ����>  1
	   ���ݾ� 10000  //balance += 10000
	   
	   ------------------
	   1.����|2.���|3.�ܰ�|4.����
	   ------------------
	   ����>  2
	   ��ݾ� 2000  //balance -= 2000
	   
	   ------------------
	   1.����|2.���|3.�ܰ�|4.����
	   ------------------
	   ����>  3
	   �ܰ�� 8000   //print(balance);
	   
	   ------------------
	   1.����|2.���|3.�ܰ�|4.����
	   ------------------
	   ����>  4
	   ���α׷� ����  run =!run;
	  */

		boolean run = true; //�ݺ�ó���� ���ǹ�Ȯ�� ����
		
		int balance = 0; //����ݾ� ����
		
		Scanner scanner = new Scanner(System.in);
		
		//
		while(run) {
			System.out.println("------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("------------------");
			System.out.println("����>");
		
			int menu = scanner.nextInt();
			int money = scanner.nextInt();			
			switch(menu) {
			
			case 1:
			    System.out.print("���ݾ�>");
				balance += scanner.nextInt(); break;
			case 2:
			    System.out.print("��ݾ�>");
				balance += scanner.nextInt();
				if(balance - money>=0 )
					balance -= money; 
				break;
			case 3:
			    System.out.println("�ܰ�>"+balance); break;
			case 4:
			    run = !run;  break;
			  default: System.out.print("�޴� ��ȣ�� Ȯ���ϼ���");
			}  //switch ��
			
		}// while ��
		
		System.out.println("���α׷� ����");
		scanner.close();
	 

	}
}

