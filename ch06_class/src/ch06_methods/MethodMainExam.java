package ch06_methods;

public class MethodMainExam {

	public static void main(String[] args) {
		
		//�޼ҵ带 �����ϰ� �ִ� Ŭ������ ��ü ����
		MethodExam m = new MethodExam();
		
		//���������� �޼ҵ� ����
		//1.����(�Ű�����0, ����Ÿ��0)
		//ù ��° ����, �� ��° ������ �޾Ƽ� ���� �� ����� intŸ������ �ǵ��� ��
		int result=m.sum(10, 10); //ȣ��� ������ �Ű������� ����
		System.out.println(result);
		// ����Ÿ���� ������ �� 
//		int result =10+10; //10+10=20�̶�� ����Ÿ�� ��� 
//		int sum(10, 10)   return 10+10
		
		//2.����(�Ű�����x, ����Ÿ��o)
		String str1=m.greeting();
		System.out.println(str1);
		
		//3.����(�Ź�߼�o, ����Ÿ��x)
		m.sumVoid(10, 30);   //MethodExam�� 3�� ����Ʈln�������
		
		//4.����(�Ű�����x, ����Ÿ��x)
		m.greetingVoid();
		

	}

}
