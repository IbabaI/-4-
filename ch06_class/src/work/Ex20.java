package work;

import java.util.Scanner;

import verify.Account;

public class Ex20 {
	
	private static Account[] accountArray = new Account[100]; //[null][null][null][null][null]...[null]
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;
	
	public static void main(String[] args) {
		
			boolean run=true;
			while(run) {
				System.out.println("---------------------------------------");
				System.out.println("1.���»��� | 2.���¸�� |3.���� |4.��� |5.����");
				System.out.println("---------------------------------------");
				System.out.println("����>");
				
				int selsctNo = scanner.nextInt();
				switch(selsctNo) {
				case 1:createAccount(); break;
				case 2:accountList(); break;
				case 3:deposit(); break;
				case 4:withdraw(); break;
				case 5:run=false; break;
				}
			}
			System.out.println("���α׷� ����");
		}
		//���»����ϱ�	
	    private static void createAccount() {
	    	System.out.println("------");
	    	System.out.println("���»���");
	    	System.out.println("------");
	    	System.out.println("���¹�ȣ: ");
	    	String ano=scanner.next();
	    	System.out.println("������: ");
	    	String owner=scanner.next();
	    	System.out.println("�ʱ��Աݾ�: ");
	    	int balance=scanner.nextInt();
	    	Account acc = new Account(ano,owner,balance );
	    	accountArray[idx++]=acc;  //idx++  -> ��������� 0 �̰� ���� ++���ش�.
	    	System.out.println("���:���°� �����Ǿ����ϴ�. ");
	    	
	    }
	    //���¸�Ϻ���
	    private static void accountList() {
	    	System.out.println("------");
	    	System.out.println("���¸�Ϻ���");
	    	System.out.println("------");
	    	
	    	//��ü ����Ÿ�� �迭�� ���������� �����鼭 ���������� null�� �ƴҶ��� ���.
	    	for(int i=0; i<accountArray.length; i++) { //�����߻�
	    		Account account = accountArray[i];
	    		if(account!=null) 
	    			
	    		System.out.println(accountArray[i]); //null�� �Ǿ��ִ� ���������� ���� toString()���� ������ nullPointer�����߻�
	    	}
	    }
	    //�����ϱ�
	    private static void deposit() {
	    	System.out.println("�Ա�");
	    	
	    	String ano=scanner.next();
	    	int amount =scanner.nextInt();
	    	
	    	Account acc=findAccount(ano);
	    	if(acc!=null)
	    	  acc.setBalance(acc.getBalance()-amount);
	    }
	    // ����ϱ�	
		private static void withdraw() {
			System.out.println("���");
			
			String ano = scanner.next();
			int amount = scanner.nextInt();
			Account acc = findAccount(ano);
			if(acc!=null) {
				if(acc.getBalance()-amount>=0) {
				   acc.setBalance(acc.getBalance()-amount);
	    		
	    	}
	    }
	    
	    //
	    
		}
	    //Account �迭���� ano�� ������ Account ��ü ã�� -
		// ����Ÿ�� �迭�� �� ��
		private static Account findAccount(String ano) {
			Account account=null;
			for(int i=0; i<accountArray.length; i++) {
				  account=accountArray[i];
				  if(account!=null) {
				if(account.getAno().equals(ano))
					return account;
				  }
			}
			return account;

	}

}
