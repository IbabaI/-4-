package ch02_01;
//은행업무 클래스(설계도)
public class Bank {
	//현재잔고 금액 필드
	
	private int balance=0;
	
	//입금기능
	public void deposit(int amount) {
		balance +=amount;
	}
	//출금가능
	public void withdrw(int amount) {
		if(balance-amount>=0)   //입금금액보다 큰 경우 마이너스 금액 출력되는 것을 방지해주는 코드
		balance -=amount;
	}
	//잔고출력
	public void currentBalance() {
		System.out.println("잔고: "+balance);
	}

}
