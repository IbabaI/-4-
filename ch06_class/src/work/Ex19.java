package work;

public class Ex19 {

	public static void main(String[] args) {
		
		
		Account1 account = new Account1();

        account.setBalance(10000);
        System.out.println("�����ܰ�: "+ account.getBalance());
        
        account.setBalance(-100);
        System.out.println("�����ܰ�: "+ account.getBalance());
        
        account.setBalance(2000000);
        System.out.println("�����ܰ�: "+ account.getBalance());
        
        account.setBalance(300000);
        System.out.println("�����ܰ�: "+ account.getBalance());

        
        //������ �����ܰ� : 10000
        //       �����ܰ� : 10000
        //       �����ܰ� : 10000
        //       �����ܰ� : 300000
	}

}
/* �ܰ�:balance(0(MIN_BLANCE)<= ������� <=1000000(MAX_BLANCE))*/
class Account1 {
	
	//�ʵ�
	private int balance;
	static final int MIN_BLANCE = 0;
	static final int MAX_BLANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<MIN_BLANCE || balance>MAX_BLANCE)
			return;
		this.balance = balance;
	}

}
	
	
	