package ch04_array;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		//����ǥ ���α׷�
	    //��ĳ�ʷ� ���� �Է¹ޱ� int[] score = {76, 45, 34, 89,100,50, 90,92}; 
		// int[] scores=new int[8];
		//�Է��� ������ �հ�, ���, ������ ����ϱ�
		//for���� ���� for������ ����ϱ�
		// 1. �����Է� | 2.���(��/���)��� | 3. ������ ����ϱ� | 4. ����
		//ch04 -7������ ����.
        
		
		// ���� Ǯ���
		int[] score = {76, 45, 34, 89,100,50, 90,92};
		int temp = 0;
		boolean run = true; 
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. �����Է� | 2.���(��/���)��� | 3. ������ ����ϱ� | 4. ����");
			System.out.println("-----------------------------------------------------");
			System.out.println("����>");
			
			int sum=0;
			int menu = scanner.nextInt();
			
			
			switch(menu) {
			case 1:
				for(int i=0; i<score.length; i++) {
					
					menu = scanner.nextInt();
					System.out.println("1. �����Է�: ");
					sum +=score[i];
					System.out.println("�հ�:"+sum);
					}
					break;
					
		    case 2:
				for(int i=0; i<score.length; i++) {
					
					sum += scanner.nextInt();
					System.out.println("2.���(��/���)��� : "+sum);
					
					double avg=0.0;  
					avg=sum/(double)score.length;
					System.out.println("���:"+sum/(double)score.length);			
					break;
				} 
			 case 3:
				 
				 for(int i=0; i<score.length; i++) {
					 
					 menu += scanner.nextInt();
						System.out.println("3. ������ ����ϱ� : "); 
						
						for(int j=i+1; j<score.length; j++) {
							if(score[i]>score[j]) {// i�� ���� ũ�� j�� ���� ��ȯ // ���������� > ��ȣ�� <���� �ٲ��ָ��
								temp=score[i]; //[i]���� �ӽú���(temp)�� ����
							    score[i]=score[j]; //j�� ���� i�� ���� ��
							    score[j]=temp; //�ӽ������� ���� �ٽ� j�� ����
							    // ���� for�� ���� �ϱ⿡�� �����. �տ��� �ڿ��� ���ؾߵǱ� ����
							}
						
						}
					}
					// ���ĵ� ���� ���
					for(int i:score) {
						System.out.println(i+"   ");  break;  
						
				}case 4: run =!run; break; 
				
				default: System.out.print("�ٸ� �޴��� ������");
				
			}
			
		}System.out.println("���α׷� ����");
		

	}

}
