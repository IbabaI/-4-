package ch06_methods_ValuePassingVs_ReferencePassig_01;

public class ValuePassing {

	public static void main(String[] args) {
		
		int n =10;
		//�Ű����������� �⺻Ÿ�� int 10�� ���� ���޵�(����)
		increase(n);
		
		System.out.println(n);

	}

	 static void increase(int m) {
		m=m+1;
		
	
		
	}

}
