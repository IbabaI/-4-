package ch04_array;

public class Array2Exam07 {

	public static void main(String[] args) {
		
		// ��� �� �� ������ ��հ� ���� �ҽ�
		
		//2�����迭 - ����ǥ �ۼ�
		String title = "����ǥ";
		String[] head = {"�̸�","����","����","����","����","���"};
		System.out.println("\t\t"+title);
		for(String h:head)System.out.print(h+"\t");
		System.out.println("\n===========================================");
		
		String[] name= {"ȫ�浿","������","�Ӳ���", "�̼���"};
		int sum=0;
		int avg=0;
		int[] tot =new int[5]; //�� ����, �� ���� �� �����ؼ� �����ϱ� ���� ����
				
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,65,87}};
		
		//���
		for(int i=0; i<score.length; i++) {//score.length- �迭�� ���� ����
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) { // score[i].length = �迭�� �� ���� ���� ����
				System.out.print(score[i][j] + "\t");
				sum+=score[i][j]; //�� �ະ ������ ���
		        tot[j]+=score[i][j]; // �� ���� ������ ���[��+��+��+��][��+��+��+��][��+��+��+��][]
		        avg=sum/score[i].length;	
		
			}// ���� for��
			System.out.println(sum+"\t"+sum/score[i].length);
			
			tot[tot.length-1]+=sum; //tot �������� sum�� ����
			tot[tot.length-2]+=avg;
			sum=0; //�ʱ�ȭ
			avg=0;
		}//�ٱ��� for��
		System.out.println("\n===========================================");
		// �� ���� �հ� ���ϱ�
		System.out.print("�� ��\t");
		for(int i=0; i<tot.length; i++) {
			System.out.print(tot[i]+"\t");
			//sum+=tot[i];
		}
		System.out.println(tot[tot.length-2]/3);
		System.out.println("\n===========================================");
		
	}

}
