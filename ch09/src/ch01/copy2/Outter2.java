package ch01.copy2;

//�ڹ�7 ���� ǥ�����
public class Outter2 {

	void method( int arg) {
//		arg=100; 
		int localBariable;
		localBariable=1;
		//localBariable=10;
		//���� Ŭ����
		System.out.println(arg);
		//�޼ҵ峻�� ����Ŭ�������� ���Ǵ� ������ ������ final�ʵ忩�� �Ѵ�.
		class Innter{
			public void method() {
			    int result = arg+localBariable;
			}
		}
	}
}
