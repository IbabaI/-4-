package ch06;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("������ �޸���.");
	}
	void checkFare() {
		System.out.println("�������");
	}

}
class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}