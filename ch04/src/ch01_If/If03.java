package ch01_If;

public class If03 {

	public static void main(String[] args) {
		
		//Integer�� int�� wrapperŬ����
		// ������ ���ڿ��� ���� intŸ�԰� ����޼ҵ�
		//Integer.parseInt("����");
		int num = Integer.parseInt(args[0]);
		if(num>0) {
			System.out.println(num);			
		}else {
			System.out.println(-1*num);
		}
		// Run ->Run Configuration -> argument -> �� �Է�

	}

}
