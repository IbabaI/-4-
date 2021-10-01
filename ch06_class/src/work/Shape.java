package work;

public class Shape {
	
String name="다각형";
	
	void run() {
		System.out.println("다각형도형.");
		
		class Triangle extends Shape{
			String name="Triangle";
		}
		class exagone extends Shape{
			String name="exagon";
		}
		class Octagon extends Shape{
			String name="Octagon";
		}
		class TPentagon extends Shape{
			String name="Pentagon";
		}
		
		
		
	}
}
