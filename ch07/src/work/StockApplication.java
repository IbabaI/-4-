package work; //��â��

import java.util.Scanner;

public class StockApplication {

	private static Account01[] accountArray = new Account01[100]; 
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;
	
	public static void main(String[] args) {
		
		boolean run=true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.��ǰ��� | 2.����Ʈ |3.�԰� |4.��� |5.����");
			System.out.println("--------------------------------------------");
			System.out.println("����>");
			
			int selsctNo = scanner.nextInt();
			switch(selsctNo) {
			case 1:registration(); break;
			case 2:list(); break;
			case 3:ibgo(); break;
			case 4:culgo(); break;
			case 5:run=false; break;
			}
		}
		System.out.println("���α׷� ����");
	}

	 private static void registration() {
	    	System.out.println("------");
	    	System.out.println("��ǰ���");
	    	System.out.println("------");
	    	System.out.println("��ǰ��ȣ : ");
	    	String serial=scanner.next();
	    	System.out.println("��ǰ�̸� : ");
	    	String product=scanner.next();
	    	System.out.println("����: ");
	    	int qty=scanner.nextInt();
	    	Account01 acc = new Account01(serial,product,qty );
	    	accountArray[idx++]=acc; 
	    	System.out.println("���:��ǰ�� ��ϵǾ����ϴ�.");
	    	
	    }
	   
	    private static void list() {
			System.out.println("------");
			System.out.println("����Ʈ");
			System.out.println("------");
			
			
			 for(int i=0;i<accountArray.length;i++) {
				 Account01 account =accountArray[i];
				 if(account!=null) {
					 System.out.println("��ǰ��ȣ:"+account.getSerial());
					 System.out.println("��ǰ�̸�:"+account.getProduct());
					 System.out.println("������:"+account.getQty());
					 System.out.println(account.toString()); 
				 }
			  }
		}
	    
	    
	    private static void ibgo() {
	    	System.out.println("-----");
	    	System.out.println("�԰�");
	    	System.out.println("-----");
	    	System.out.println("��ǰ��ȣ: ");
	    	String ano=scanner.next();
	    	System.out.println("�԰����");
	     	int amount =scanner.nextInt();
	    	
	    	Account01 acc=findAccount(ano); 
	    	if(acc!=null) {
	    	  acc.setQty(acc.getQty()+amount);
	    	System.out.println("��� : �԰� �����Ͽ����ϴ�.");
	    } else {
	    	System.out.println("��� : ��ǰ��ȣ�� Ȯ�����ּ���");
	    }
}
	   
	    private static void culgo() {
			System.out.println("------");
			System.out.println("���");
			System.out.println("------");
			System.out.print("��ǰ��ȣ");
			String ano = scanner.next();
			System.out.print("������");
			int amount = scanner.nextInt();
			Account01 acc = findAccount(ano);
			if (acc != null) {
				if (acc.getQty() - amount >= 0) {
					acc.setQty(acc.getQty() - amount);
					System.out.println("���:��� �����Ǿ����ϴ�.");
				}else {
					System.out.println("���:��� �����մϴ�.");
				}
			}else {
				System.out.println("���:��ǰ��ȣ�� Ȯ�����ּ���.");
			} 
		}
	   
		
		private static Account01 findAccount(String ano) {
			Account01 account=null; 
			for(int i=0; i<accountArray.length; i++) {
				  account=accountArray[i];
				  if(account!=null) {
				if(account.getSerial().equals(ano))
					break; 
				  }
			}
			return account; 

	}

}
