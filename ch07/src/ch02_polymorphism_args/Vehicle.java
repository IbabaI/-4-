package ch02_polymorphism_args;

public class Vehicle {

	void run() {
		System.out.println("운송수단이 이동합니다.");
	}
}

class Bus extends Vehicle {
	void run() {
		System.out.println("Bus가 달립니다.");
	}
}
class Turck extends Vehicle {
	void run() {
		System.out.println("Truck가 달립니다.");
	}
}