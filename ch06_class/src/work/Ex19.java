package work;

public class Ex19 {

	public static void main(String[] args) {
		
		
		Account1 account = new Account1();

        account.setBalance(10000);
        System.out.println("현재잔고: "+ account.getBalance());
        
        account.setBalance(-100);
        System.out.println("현재잔고: "+ account.getBalance());
        
        account.setBalance(2000000);
        System.out.println("현재잔고: "+ account.getBalance());
        
        account.setBalance(300000);
        System.out.println("현재잔고: "+ account.getBalance());

        
        //실행결과 현재잔고 : 10000
        //       현재잔고 : 10000
        //       현재잔고 : 10000
        //       현재잔고 : 300000
	}

}
/* 잔고:balance(0(MIN_BLANCE)<= 저축범위 <=1000000(MAX_BLANCE))*/
class Account1 {
	
	//필드
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
	
	
	