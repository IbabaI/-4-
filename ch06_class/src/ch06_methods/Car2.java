package ch06_methods;

public class Car2 {
//�޼ҵ�
	int gas;
	//����Ÿ�� ���� �޼ҵ忡�� return���� �޼ҵ带 �����Ѵ� ���� - ����� �ǵ����ִ� ���� �ƴ�
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ�: "+gas+")");
				gas--;
			}else { 
				System.out.println("����ϴ�.(gas�ܷ�:"+gas+")");
				return; //�޼ҵ�����
			}
		}
	}
}
