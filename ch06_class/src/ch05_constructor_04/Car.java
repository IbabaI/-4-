package ch05_constructor_04;

public class Car {

	//������
	//signature(�ñ״���) -����ΰ� �ٸ��� �ٸ� �����ڷ� �ν�(jvm)
	//�Ű������� Ÿ��, ����, ���� �� �ٸ��� �ٸ� ������ 
	Car(){}
	Car(String model){}
	Car(String model, String color){} // String, String
	//Car(String color, String model){} // �����ε� �ƴ� String, String
	Car(String mode,String color, int maxSpeed){} //String, String, int
	Car(int maxSpeed, String mode,String color){} //int, String, String
}
