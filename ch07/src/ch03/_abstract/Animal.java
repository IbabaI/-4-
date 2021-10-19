package ch03._abstract;

//1. ��ü�����Ұ�
//2. �߻�޼ҵ�� �ڽ�Ŭ�������� �ݵ�� ������ �ؾ���
public abstract class Animal {

	abstract void run(); // ����ΰ� ���� ����θ� �����ϴ� �޼ҵ� - �߻�޼ҵ�
	public static void main(String[] args) {
		//��ü(��ü)�� ���� �� �� ���� Ŭ���� - abstract
//		Animal a = new Animal();
		Fish f=new Fish();
		Bird b=new Bird();
		Insect i=new Insect();
//		a.run();
		f.run();
		i.run();
	}
}

class Fish extends Animal{
	void run() {
		System.out.println("���Ĩ�ϴ�.");
	}
}
class Bird extends Animal{
	void run() {
		System.out.println("���󰩴ϴ�.");
	}
}
class Insect extends Animal{
	//�ݵ�� �޼ҵ� ������ �ؾ���
	void run() {
		System.out.println(" ���ϴ� ");
	}
}