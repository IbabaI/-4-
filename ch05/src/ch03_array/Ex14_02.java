package ch03_array;

public class Ex14_02 {

	public static void main(String[] args) {
		
		//����Ÿ��(String) 1���� �迭 ����
		String[] snake = {"������","�ȷ���","ĥ����","������","������"};
		String[] insect= {"�޶ѱ�","����","������"};
		
		//����Ÿ���� �迭�� �� ����� �ʱⰪ�� �⺻���� null�� �Ǿ� ����
		//�ι迭 ��ġ�� [null][null][null][null][null][null][null][null][null]
		String[] animal = new String[snake.length +insect.length+1]; //+1�������
		
		//��ġ��
		for(int i=0; i<snake.length; i++) {animal[i]=snake[i];}
		for(int i=0; i<insect.length; i++) { animal[snake.length+i]=insect[i];} //+i �������
		
		//������ü�� �����ϰ� �ִ� �迭�� �� index�� �ش��ϴ� ���� ��ü�� �ּҹ����� ����
		//�� ��� ����� index��ȣ�� ����� ����� �ּҰ��� �����.
		System.out.println(snake[0]==animal[0]?"���ϰ�ü ����":"�ٸ���ü ����");  
		System.out.println(snake[0].hashCode()); //snske[0] ������ String��ü
		System.out.println(animal[0].hashCode());
		
		String str = snake[0];
		System.out.println(str.hashCode());
		
		//���
		for(String s:animal)
			System.out.print(s+" ");
		
		System.out.println();
				

		
		
		/*�Ŀ�����Ʈ 5�� 20������*/
		
		
		
		
		
		
		
		
		/*	//���
		for(int i=0; i<snake.length; i++)
			System.out.print(snake[i]+" ");
		System.out.println();
		
		for(int i=(snake.length-1); i>=0; i--)
			System.out.print(snake[i]+" ");
		System.out.println();
		
		
		//���� for��
		
		for(String n:snake)
			System.out.print(n+" ");
		System.out.println();*/

	}

}
