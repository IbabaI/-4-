package ch03_array;

public class Exam_array {

	public static void main(String[] args) { { //argument, ����, �Ű����� �κ�
		
		//Ÿ��[] ������
		//String[] args
		//main( �ܺη� ���� ���� ���� ���� )
		//main()�޼ҵ���
		//�Ű������κ�()�� ���� �迭 String[] args
		//�� ���̰� ���������� ���� �迭
		//�ڹ����α׷� �����  argument�� �����ؼ� ������
		//�ƱԸ�Ʈ�� ������ŭ String[]�迭 �����Ǿ ����
		//java A hello world my name is �浿
		//=> Sting[] args={hello, world, my, name, is, �浿}
		
			
			System.out.println("�迭�� ����: "+ args.length);
			System.out.println("�迭�� ù��° ��: " +args[0]);
			System.out.println("�迭�� �ι�° ��: " +args[1]);
	// Run -> Run Configurations... ������ (x)=Arguments �ȿ� �Է�
			
			for(int i=0; i<args.length; i++)
				System.out.println(args[1]);		

	}

}
}