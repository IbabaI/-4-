package ch04_array;

import java.util.Scanner;

public class Exam02_04 {

	public static void main(String[] args) {
		
		//1. id="hong", pwd="1234"
		// id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �Ѵ� ������ "login����",
        // �ƴϸ� "1ȸ �����Ͽ����ϴ�". ���
		// 5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�" ��� �� ����
	    
		Scanner scanner = new Scanner(System.in);
		int cnt=0; // �ʱ�ȭ
		for(;;) {// ���ѹݺ�
			String id,pwd; //����Ÿ�Ժ���
			if(cnt==5) {// �⺻����Ÿ Ÿ���� �� �� , 5ȸ �غ��� �극��ũ
		      System.out.println(cnt +"ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�");
			  break;
			} // 5�� �����ϸ� ���������� ����-���� ���ϱ�
			
		   System.out.println("���̵�� �н����带 �Է��ϼ���.");
		   System.out.println("���̵�>");
		   id=scanner.next(); //StringŸ������ ����
		   
		   System.out.println("�н�����>");
		   pwd=scanner.next();//StringŸ������ ����
		   if("hong".equals(id)) {
			   if("1234".equals(pwd)) {
				   System.out.println("�α��� ����"); 
				     break; 
			   }
		   }
			   
			switch(id) {
			case "hong" :
				         switch(pwd) {
				         case "1234" :
				        	 System.out.println("�α��� ����");
				        	 break label;
				         
				     default:
				     }
		    default:
			   
			} 
			
			//���н�
			cnt++; //����
			if(cnt!=5)
		   System.out.println(cnt +"ȸ �����Ͽ����ϴ�.");
		}	
		System.out.println("���α׷� ����");
		
		
	}
}