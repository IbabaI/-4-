package ch02_polymorphism_args;

public class Drive {

	void drive(Vehicle v) {
		v.run();
	}
	void drive(Vehicle[] vs) {
		for(Vehicle v:vs) {
			v.run();
		}
	}
public static void main(String[] args) {
	Drive drv = new Drive();
	Vehicle v1=new Vehicle();
	drv.drive(v1);
	
	Bus bus = new Bus();
	drv.drive(bus);

	Turck truck = new Turck();
	drv.drive(truck);
	
	Vehicle[] vehicle = new Vehicle[4];
	vehicle[0]=v1;
	vehicle[1]=bus;
	vehicle[2]=truck;
	vehicle[3]=bus;
	
	drv.drive(vehicle);
}
}

