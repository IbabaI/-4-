package ch03_array;

public class Ex07 {

	public static void main(String[] args) {
		
		//1���� �迭�� �ִ밪 �ּҰ� ���ϱ�
				int[] score = {76, 45, 34, 89,100,50, 90,92}; //�ִ밪: 100, �ּҰ�:34
				//max������ �迭�� ���� ���� �����ϰ� ������ �����Ͽ� ����
				//min������ �迭�� ���� ���� �����ϰ� ū �� �����Ͽ� ����
				int sum=0, max=0, min=100;
				
				//���� for������ �����ؼ� �ִ밪, �ּҰ�, �հ�, ����� ����Ͻÿ�
				
				
				for(int t:score) {
					sum+=t;
					if(max < t) max=t;//max�� ���� score���� ũ�� ��ȯ
				}
				System.out.println("�ִ밪:" +max);
				for(int i:score) {
					if(min > i) min= i;//min�� ���� score���� ������ ��ȯ
					
					}		
				System.out.println("�ּҰ�:" +min);
				
				System.out.println("�հ�:"+sum);
				System.out.println("���:"+sum/(double)score.length);
						

	}

}
