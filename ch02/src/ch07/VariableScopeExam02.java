package ch07;

public class VariableScopeExam02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //main�޼ҵ� �������� ����� ���ú���
	  int var1=0;// ���� �� �� �ʱ�ȭ

      if(true) {
    	  //main�޼ҵ峻�� if������ ����� ���ú���
    	  int var2;
          int var3;    	  
    	  var1=1; //�� ����
    	  //���� ������ �������� ����� ������ ���� ���� ������ ����� �ߺ���������߻�
    	  //int var1;
      }
      while(true) {
    	  //main�޼ҵ峻�� while������ ����� ���ú���
    	  int var3;
    	  int var2;

    	  break;//�ݺ����� ���������� �ϴ� ��ɾ�
      }
      System.out.println(var1);
     // System.out.println(var2);
     // System.out.println(var3);
	}
}