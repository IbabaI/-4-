package ch06_methods_ValuePassingVs_ReferencePassig_01;

public class ReferencePassing {

	public static void main(String[] args) {
		// Circle ��ü ����
		Circle pizza = new Circle(10); // ���� �ذ��Ϸ���  �����ڿ� Circle(int r) { radius = r;}�� ��������
		// �Ű������� ��ü�� ����
		increase(pizza);  // increase �Լ��� �޼ҵ� ȣ�� 
		//���?
		System.out.println(pizza.radius); // 11

	}

	static void increase(Circle m) {
		m.radius++; // 11
	}
}
class Circle {
	//�ʵ�
	int radius;
	
	//������
	Circle(int r) {
		radius = r;
		
	}
	
}