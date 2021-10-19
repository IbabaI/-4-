package ch06;

public class DriverExampe {

	public static void main(String[] args) {
		 Driver driver = new Driver();
		 
		 Bus bus = new Bus();
		 Taxi taxi = new Taxi();
		 
		
		 driver.drive(bus);
		 driver.drive(taxi);
		 driver.drive(new Bus());//Vehicle vehicle = new Bus();
	}
	

}
