package ch02;

// public Ű����� �ܺο��� ���ٰ����� ���� ��������
public class Calculator {
	//model���� �ܺο��� ���ٰ���, �����Ǹ� �ȵ�.
	public String model="00001";
	
	//result���� getCalc�� ���ؼ� ó���� ���� ����
//	public double result=0;
	private double result = 0;  // �ܺο��� ���� �Ұ�
	
	// ���� Ŭ�������� �żҵ�鳢���� ��ȣ ȣ�� ����.
	public void getCalc(String op, int x, int y) {
		switch(op) {
		case"+": result =add(x,y);
			     System.out.println(add(x,y)); break;
		case"-": result =sub(x,y);
			     System.out.println(sub(x,y)); break;
		case"*": result =mul(x,y);
			     System.out.println(mul(x,y)); break;
		case"/": result =div(x,y);
			     System.out.println(div(x,y)); break;
		}
	}
	// �Ʒ��� �޼ҵ���� getCalc()�޼ҵ常 ȣ�Ⱑ�� - �ܺο��� ȣ��Ұ�
	public int add(int x, int y) { return x+y; }
	public int sub(int x, int y) { return x-y; }
	public int mul(int x, int y) { return x*y; }
	public double div(int x, int y) { return x/(double)y; }

	// public�� private�� �ٲ��ָ� �ܺο��� ���پȵ�.
}
