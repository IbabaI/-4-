package ch03_array;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] scores= {78,98,54,76,87};
		System.out.println("�迭�� ����: "+scores.length);
		
		//����
		int total = 0; //�ʱ�ȭ
		for(int i=0; i<scores.length; i++) {
			total+=scores[i];
		}
		System.out.println("����: "+total);
		//��� - doubleŸ�� �������
		double avg=0.0;  //0 ���� �ص� ������� -> 0.0���� ����ȯ
		avg=total/(double)scores.length;
		System.out.println("���: "+avg);
		
		//���� for������ �������ϱ�
		total=0;
		for(int s:scores) {
			total +=s; // scores[0], seores[1],...
			System.out.println("����: " +s);
		}
		avg=total/(double)scores.length;
		System.out.println("���: "+avg);	

	}

}
