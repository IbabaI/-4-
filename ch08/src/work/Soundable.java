package work;

public interface Soundable {

	String sound();
}
class Cat implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "具克";
	}
	
}
class Dog implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "港港";
	}
	
}