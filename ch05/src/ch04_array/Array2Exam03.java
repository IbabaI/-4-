package ch04_array;
/*
 * 2�� 3���� 2���� �迭 ����
 * 1,2,3,4,5,6
 * 1,2,3
 * 4,5,6
 * */
public class Array2Exam03 {

	public static void main(String[] args) {
		
		//�ʱⰪ���� 2�����迭 ����, 1�����迭 �ΰ��� 2���� �迭 �ϳ� ����
				int[][] scores= new int[][]{{1,2,3},{4,5,6}};
				
				//2�������� length�� ���� 1���� �迭�� ���� �ǹ�
				System.out.println("1�����迭�� ����: "+scores.length);//2
				
				System.out.println("�� 1�����迭�� ����� ��:" + scores[0].length);
				System.out.println("�� 1�����迭�� ����� ��:" + scores[1].length);
				//���
			
				for(int i=0; i<scores.length; i++) {//i�� scores.length�� 1�����迭�� ����
					for(int j=0; j<scores[i].length; j++) {//j�� �� ���� 1�����迭�� ��Ҽ�
						System.out.print(scores[i][j]+" ");
						
					}System.out.println();
				}	
				
				// ���� 
				// ���� for���� �̿��Ͽ� 2���� �迭�� ��ҵ��� ��� ����ϼ���.
			   // int -> int[] 1����-> int[][] 2���� ->int [][][] 3����
				
				for(int[] t1:scores) {
					for(int t:t1) {
						System.out.print(t+" ");	
				   
					
				} System.out.println();
			}			

	}

}
