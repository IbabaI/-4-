package work;

public class NestedClassExample {

	public static void main(String[] args) {
		

		Ex04_Car myCar = new Ex04_Car();
		  
		Ex04_Car.Tire tire = myCar.new Tire();

		Ex04_Car.Engine engine = new Ex04_Car.Engine();
		   
	}

}
