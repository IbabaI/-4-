package ch04_array;

public class Array2Exam05 {

	public static void main(String[] args) {
		
		//1������ �ʱⰪ�� ������ �迭�� 2���� �迭 �����
		
		String[] name= {"ȫ�浿","������","�Ӳ���", "�̼���"};
		int sum=0;
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,65,87}};
		
		//���
		for(int i=0; i<score.length; i++) { //score.length- �迭�� ���� ����
			for(int j=0; j<score[i].length; j++) { // score[i].length = �迭�� �� ���� ���� ����
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j]; //�� �ະ ������ ���
		}// ���� for��
			System.out.println(sum+"\t"+sum/score[i].length);
			sum=0; //�ʱ�ȭ
		}//�ٱ��� for��
	}

}
