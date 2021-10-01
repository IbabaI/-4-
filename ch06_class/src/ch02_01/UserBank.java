package ch02_01;

public class UserBank {

	public static void main(String[] args) {
		
		//Bank객체 생성
		Bank bank = new Bank();
//		System.out.println("잔고: "+bank.balance);
//		bank.balance=10000;
//		bank.balance=bank.balance-5000;
//외부에서 접급못하기 때문에 오류
		
		
		//입금기능 호출
		bank.deposit(10000);
		
		//출금기능 호출
		bank.withdrw(8000);  
		
		//잔고 출력
		bank.currentBalance();
	}

}
