package ch07;

public class VariableScopeExam01 {

	public static void main(String[] args) {
		
		// main �޼ҵ� �������� ����� ���ú���
		int var1;
		
		
		
		if(true) {
			// main�޼ҵ峻�� if ������ ����� ���ú���
			int var2;
			var1 =1; // main�޼ҵ� ���� if�������� ��밡��
			var2 =2; // �ڽ��� ����� �������� ��밡��
			int result = var1 + var2;
			
			System.out.println(result);
			
		}
		
		
		
		while(true) {
	        // main�޼ҵ峻�� while������ ����� ���ú���
			int  var3;
			System.out.println(var1);
			var3=3;
			var1=4; //while������ ���ο� �� ����
			System.out.println(var1+var3);
			//
		//  var2=5; �ĺ��ڰ� �־����� ������ ��� �Ұ���
				break; // �ݺ����� ���������� �ϴ� ��ɾ�
				
		}
		
		System.out.println(var1); // break�� ������� ������ ��������.
	//	System.out.println(var2);
	//	System.out.println(var3);
	}

}
