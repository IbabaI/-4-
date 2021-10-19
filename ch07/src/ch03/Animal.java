package ch03;

public class Animal {

	void run() {
		System.out.println("이동합니다.");
	}
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Fish f=new Fish();
		Bird b=new Bird();
		Insect i=new Insect();
		a.run();
		b.run();
		i.run();
	}
}

class Fish extends Animal{
	void run() {
		System.out.println("헤엄칩니다.");
	}
}
class Bird extends Animal{
	void run() {
		System.out.println("날라갑니다.");
	}
}
class Insect extends Animal{
	// 메소드 재정의 안함
	void run() {
		System.out.println("기어갑니다.");
	}
}