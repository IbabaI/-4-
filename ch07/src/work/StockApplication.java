package work; //이창빈

import java.util.Scanner;

public class StockApplication {

	private static Account01[] accountArray = new Account01[100]; 
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;
	
	public static void main(String[] args) {
		
		boolean run=true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.상품등록 | 2.리스트 |3.입고 |4.출고 |5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>");
			
			int selsctNo = scanner.nextInt();
			switch(selsctNo) {
			case 1:registration(); break;
			case 2:list(); break;
			case 3:ibgo(); break;
			case 4:culgo(); break;
			case 5:run=false; break;
			}
		}
		System.out.println("프로그램 종료");
	}

	 private static void registration() {
	    	System.out.println("------");
	    	System.out.println("상품등록");
	    	System.out.println("------");
	    	System.out.println("상품번호 : ");
	    	String serial=scanner.next();
	    	System.out.println("상품이름 : ");
	    	String product=scanner.next();
	    	System.out.println("수량: ");
	    	int qty=scanner.nextInt();
	    	Account01 acc = new Account01(serial,product,qty );
	    	accountArray[idx++]=acc; 
	    	System.out.println("결과:상품이 등록되었습니다.");
	    	
	    }
	   
	    private static void list() {
			System.out.println("------");
			System.out.println("리스트");
			System.out.println("------");
			
			
			 for(int i=0;i<accountArray.length;i++) {
				 Account01 account =accountArray[i];
				 if(account!=null) {
					 System.out.println("상품번호:"+account.getSerial());
					 System.out.println("상품이름:"+account.getProduct());
					 System.out.println("재고수량:"+account.getQty());
					 System.out.println(account.toString()); 
				 }
			  }
		}
	    
	    
	    private static void ibgo() {
	    	System.out.println("-----");
	    	System.out.println("입고");
	    	System.out.println("-----");
	    	System.out.println("상품번호: ");
	    	String ano=scanner.next();
	    	System.out.println("입고수량");
	     	int amount =scanner.nextInt();
	    	
	    	Account01 acc=findAccount(ano); 
	    	if(acc!=null) {
	    	  acc.setQty(acc.getQty()+amount);
	    	System.out.println("결과 : 입고에 성공하였습니다.");
	    } else {
	    	System.out.println("결과 : 상품번호를 확인해주세요");
	    }
}
	   
	    private static void culgo() {
			System.out.println("------");
			System.out.println("출고");
			System.out.println("------");
			System.out.print("상품번호");
			String ano = scanner.next();
			System.out.print("출고수량");
			int amount = scanner.nextInt();
			Account01 acc = findAccount(ano);
			if (acc != null) {
				if (acc.getQty() - amount >= 0) {
					acc.setQty(acc.getQty() - amount);
					System.out.println("결과:출고가 성공되었습니다.");
				}else {
					System.out.println("결과:재고가 부족합니다.");
				}
			}else {
				System.out.println("결과:상품번호를 확인해주세요.");
			} 
		}
	   
		
		private static Account01 findAccount(String ano) {
			Account01 account=null; 
			for(int i=0; i<accountArray.length; i++) {
				  account=accountArray[i];
				  if(account!=null) {
				if(account.getSerial().equals(ano))
					break; 
				  }
			}
			return account; 

	}

}
