package ch04_array;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		//1. id="hong", pwd="1234"
		// id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����",
        // �ƴϸ� "1ȸ �����Ͽ����ϴ�". ���
		// 5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�" ��� �� ����
	    
		Scanner scanner = new Scanner(System.in);
		int cnt=0;
		
		// �������� Ǯ���ذ�
		while(true) {
			String id,pwd;
			if(cnt==5) {// �⺻����Ÿ Ÿ���� �� �� , 5ȸ �غ��� �극��ũ
		      System.out.println(++cnt +"ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�");
			  break;
			}
			
		   System.out.println("���̵�� �н����带 �Է��ϼ���.");
		   System.out.println("���̵�>");
		   id=scanner.next(); //StringŸ������ ����
		   
		   System.out.println("�н�����>");
		   pwd=scanner.next();//StringŸ������ ����
		   if("hong".equals(id) && "1234".equals(pwd)) { //������ü�� �� �� ����
		  
			   {System.out.println("�α��� ����"); 
			     break;
			    }
			}
			System.out.println(++cnt +"ȸ �����Ͽ����ϴ�.");
		}	
		System.out.println("���α׷� ����");
		
		
	}
}