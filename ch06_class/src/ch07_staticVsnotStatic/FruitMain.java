package ch07_staticVsnotStatic;

public class FruitMain {

	public static void main(String[] args) {
		
		//객체들이 공유할 수 잇는 멤버 - static멤버
		Fruits f1 = new Fruits(10);
		Fruits f2 = new Fruits(50);
		Fruits f3 = new Fruits(30);
		System.out.println("첫번째소비:"+f1.amount);
		System.out.println("두번째소비:"+f2.amount);
		System.out.println("새번째소비:"+f3.amount);
		System.out.println("현재과일량:"+Fruits.currentAmount);
		

	}

}
