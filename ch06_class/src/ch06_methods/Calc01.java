package ch06_methods;

public class Calc01 {
	// �ʵ�
	int i=0,j=0;
	
	//��(�Ű�����o, ����Ÿ��o)
	int add(int x, int y) {
		return x+y;
	}
	//������(�Ű�����x, ����Ÿ��o)
public	int divid() {
		return i/j;
	}
    //����(�Ű�����o, ����Ÿ��x)
public void sub(int x, int y) {
	System.out.println(x-y);
	}
    //���ϱ�(�Ű�����x, ����Ÿ��x)
public void mul() {
	System.out.println(i*j);
}
}
