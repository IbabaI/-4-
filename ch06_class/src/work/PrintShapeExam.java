package work;

public class PrintShapeExam {

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		Triangle triangle = new Triangle();
		Hexagon hexagon=new Hexagon();
		Octagon octagon=new Octagon();
		Pentagon pentagon=new Pentagon();
		
		System.out.println(triangle.name);
		System.out.println(hexagon.name);
		System.out.println(octagon.name);
		System.out.println(pentagon.name);

	}

}
