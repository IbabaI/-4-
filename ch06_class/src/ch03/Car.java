package ch03;

//Ŭ������ ���� ���-�ʵ�, ������,�޼ҵ�
public class Car {
	//�ʵ� ����
	//Ÿ�� �ʵ��[=�ʱⰪ];
	//�ʵ带 ����� �ʱⰪ�� ���� ������
	//�ش� Ÿ���� �⺻������ �ʱ�ȭ��.
	
	//�����Ӽ�
	String company="�����ڵ���";//����Ÿ�� �ʵ�
	String model="�׷���";//����Ÿ�� �ʵ�
	int maxSpeed=300;//�⺻Ÿ�� �ʵ�
	
	int productionYear;//�⺻Ÿ�� �ʵ� -�� 0
	
	//�������
	int currentSpeed;//�⺻Ÿ���ʵ� - �� 0
	boolean engineStrart;//�⺻Ÿ���ʵ� - �� false
	
	
	//��ǰ
	Engine engine; //����Ÿ���ʵ� - �� null
	Handle hadle; //����Ÿ���ʵ� - �� null
	Tire tire; //����Ÿ���ʵ� - �� null

}
