package work;

public interface Soundable {

	String sound();
}
class Cat implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "�߿�";
	}
	
}
class Dog implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "�۸�";
	}
	
}