package ch03_for;

public class ForExam06 {

	public static void main(String[] args) {
		
		//for(�ʱ�ȭ; for���� ���������� ���� ;  ����   {���๮}
		for(int i=1; ; i++) {  
			//for���� ���������� ������ true
			//(�����ϰ� �����ݷи� �Է� ����)
			
			System.out.println(i+"hello");
			
			//for���� ���������� ������ �������� ó��{}
		if(i==10) break; //���� ���������� ��ɹ� break;
		}
		System.out.println("end");

	}

}
