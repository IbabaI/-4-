package ch03._abstract;

public class HourlyMan extends Employee  {

	//�ʵ�
	int workHour, moneyPerHour;
	
	//������
	public HourlyMan(String name, int workHour, int moneyPerHour) {
		super(name);
		this.workHour=workHour;
		this.moneyPerHour=moneyPerHour;
	}
	@Override
	int computePay() {
		return workHour*moneyPerHour;
		
	}
}
