package ch01;

//�ڹ�7 ���� ǥ�����
public class Outter {

	void method(final int arg) {
//		arg=100;  //final�� �ֱ� ������ ��� x
		final int localBariable;
		localBariable=1;
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
