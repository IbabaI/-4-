package ch02_01;

public class UserBank {

	public static void main(String[] args) {
		
		//Bank��ü ����
		Bank bank = new Bank();
//		System.out.println("�ܰ�: "+bank.balance);
//		bank.balance=10000;
//		bank.balance=bank.balance-5000;
//�ܺο��� ���޸��ϱ� ������ ����
		
		
		//�Աݱ�� ȣ��
		bank.deposit(10000);
		
		//��ݱ�� ȣ��
		bank.withdrw(8000);  
		
		//�ܰ� ���
		bank.currentBalance();
	}

}
