package ch06;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
	void checkFare() {
		System.out.println("승차요금");
	}

}
class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}