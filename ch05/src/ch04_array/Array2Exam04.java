package ch04_array;

public class Array2Exam04 {

	public static void main(String[] args) {
		
		//1������ �ʱⰪ�� ������ �迭�� 2���� �迭 �����
		
		String[][] snake= {{"������,�ȷ���,ĥ����"},{"������, ������, ������"}};
		
		//���
		for(int i=0; i<snake.length; i++) { //snake.length- �迭�� ���� ����
			for(int j=0; j<snake[i].length; j++) { // snake[i].length = �迭�� �� ���� ���� ����
				System.out.println(snake[i][j]);
			if(j!=snake[i].length-1) //length-1 = ���� ������ index��ȣ
				System.out.print(",");
		}
			System.out.println();	
		}
	}

}
