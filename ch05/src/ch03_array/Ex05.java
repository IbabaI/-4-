package ch03_array;

public class Ex05 {

	public static void main(String[] args) {
		
       double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
		
		//���� for���� �̿��Ͽ�
		//�հ� ��� ���
				
		double total =0;
		for(int i=0; i<scores.length; i++)
		    total+=scores[i];
		
		total=0;
		for(double d:scores) { //d�� ���������Ѱ���
			total+=d;
		}
		System.out.printf("�հ�:%.2f\n ",total);
		System.out.println("�հ�: "+(((int)total*10000)/10000));
		System.out.println("�հ�: "+(((int)total*100)/100));
		System.out.println("�հ�: "+(int)(total*100)/100.0);
			
			
		double avg=total/(double)scores.length;
		System.out.printf("%.3f", avg); // �Ҽ��� 3��° �ڸ� �ø����� �ڸ�
		}	

	}


