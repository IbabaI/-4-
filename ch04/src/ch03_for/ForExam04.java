package ch03_for;

public class ForExam04 {

	public static void main(String[] args) {
		
		// 1~100������ �� ���ϱ�
		for(int i =0; i<=10; i++) { 
			System.out.print(i+"\t");
			
		}
		System.out.println(); // ���� �Ʒ��� ����
		
		for(int i =0; i<=10; i+=2) { 
			System.out.print(i+"\t");
		}
        System.out.println(); // ���� �Ʒ��� ����
		
		for(int i =0; i<=10; i+=3) { 
			System.out.print(i+"\t");
		
		}
        System.out.println(); // ���� �Ʒ��� ����
		
		for(int i =1; i<=100; i*=2) { // i=i*2
			System.out.print(i+"\t");
	}
        System.out.println(); // ���� �Ʒ��� ����
		
		for(int i =10; i>0; i--) { // i=i-1, --i
			System.out.print(i+"\t");
}
        System.out.println(); // ���� �Ʒ��� ����
		
		for(int i =10; i>0; i--) { // �ʱ�ȭ �� i>10 �񱳿����� false�̹Ƿ� ��{}���� ����
			System.out.println(i+"\t");
}      System.out.println(); 
       System.out.println("����");
}     
}
