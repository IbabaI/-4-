package ch04;

public class Car02 {

	Tire[] tires= {
			new HankookTire(),
			new HankookTire(),
			new KumhoTire(),
			new KumhoTire(),
	};
	
	void run() {
//		for (  int i=0; i<tires.length;i++)tires[i].roll(); 	}
	    for (Tire tire:tires)tire.roll(); }
	
	public static void main(String[] args) {
		Car02 myCar= new Car02();
		myCar.run();
	}
}
