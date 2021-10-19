package work; //�̵�ȣ

import java.util.Scanner;

public class StockApplication5 {

	private static Stock[] stockArray = new Stock[100];//[null][null][null][null]..[null]-100��
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args) {
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.��ǰ���� |2.��ǰ��� |3.�԰� |4.��� |5.����");
		 System.out.println("--------------------------------------");
		 System.out.println("����>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createStock(); break;
		 case 2: StockList();break;
		 case 3: importing(); break;
		 case 4: exporting(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("���α׷� ����");
		
	}
	//���»����ϱ�
	private static void createStock() {
		System.out.println("------");
		System.out.println("��ǰ����");
		System.out.println("------");
		System.out.print("��ǰ�̸�:");
		String name = scanner.next();
		System.out.print("�ܰ��:");
		int balance = scanner.nextInt();
		
		Stock acc = new Stock(name, balance);
		
		//[Stock][Stock][Stock][][][][][][][][][][][][][][][][]...[]
		
		stockArray[idx++] = acc;
		
		System.out.println("���:��ǰ�� �����Ǿ����ϴ�.");
	}
	//��ǰ��Ϻ���
	private static void StockList() {
		System.out.println("------");
		System.out.println("��ǰ���");
		System.out.println("------");
		
		//��ü ����Ÿ�� �迭�� ���������� �����鼭 ���������� null�� �ƴҶ��� ���.
		 for(int i=0;i<stockArray.length;i++) { //�����߻�
			 Stock Stock =stockArray[i];
			 if(Stock!=null) {
				 System.out.println("��ǰ���:"+Stock.getitem());
				 System.out.println("��ǰ�̸�:"+Stock.getname());
				 System.out.println("�ܰ��:"+Stock.getbalance());
				 System.out.println(Stock.toString()); //null�� �Ǿ��ִ� ���������� ���� toString()���� ������ nullPointer�����߻�
			 }
		  }
	}
	
	//�԰��ϱ�
	private static void importing() {
		System.out.println("------");
		System.out.println("�԰�");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String item = scanner.next();
		System.out.print("�԰��");
		int amount = scanner.nextInt();
		Stock acc = findStock(item);
		if (acc != null) {
			acc.setbalance(acc.getbalance() + amount);
            System.out.println("���:�԰� �����Ǿ����ϴ�.");
		}else {
			System.out.println("���:��ǰ��ȣ�� Ȯ�����ּ���.");
		}
	}
     //����ϱ�	
	private static void exporting() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String ano = scanner.next();
		System.out.print("����");
		int amount = scanner.nextInt();
		Stock acc = findStock(ano);
		if (acc != null) {
			if (acc.getbalance() - amount >= 0) {
				acc.setbalance(acc.getbalance() - amount);
				System.out.println("���:��� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���:�ܰ� �����մϴ�.");
			}
		}else {
			System.out.println("���:��ǰ��ȣ�� Ȯ�����ּ���.");
		} 
	}
     // [Stock][Stock][null][null][Stock][null].....[null]
	//Stock �迭���� ano�� ������ Stock ��ü ã��-
	//����Ÿ�� �迭�� �� ��
	private static Stock findStock(String ano) {
		Stock Stock=null;//���ú���
		for(int i=0;i<stockArray.length;i++) {
			  Stock =stockArray[i];
			if(Stock!=null) {  
			  if(Stock.getitem().equals(ano))
				break;//ano�� �ش��ϴ� ��ü ����
			}
		}
		return Stock;	//�迭 ��ü�� ã�Ƶ� ������ null����
	}
}