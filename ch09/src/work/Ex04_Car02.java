package work;

//������ Ǯ��

public class Ex04_Car02 {
	
/*������ ���� CarŬ���� ���ο� Tire�� Engine�� ��� Ŭ������ ����Ǿ� �ֽ��ϴ�.
NestedClassExample���� ��� Ŭ������ ��ü�������ϴ� �ڵ带 �ۼ��غ�����.*/

public static void main(String[] args) {
	 //�ٱ� Ŭ���� �ν��Ͻ� ����
	  Car myCar = new Car();
	  Car.Tire tire = myCar.new Tire();
	  //
	  Car.Engine engine = new Car.Engine();
	 
	}
}
	class Car{
	 class Tire{}//�ν��Ͻ�
	 static class Engine{}//static
	}
