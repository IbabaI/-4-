package work; //이동호

import java.util.Scanner;

public class StockApplication5 {

	private static Stock[] stockArray = new Stock[100];//[null][null][null][null]..[null]-100개
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args) {
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.상품생성 |2.상품목록 |3.입고 |4.출고 |5.종료");
		 System.out.println("--------------------------------------");
		 System.out.println("선택>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createStock(); break;
		 case 2: StockList();break;
		 case 3: importing(); break;
		 case 4: exporting(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("프로그램 종료");
		
	}
	//계좌생성하기
	private static void createStock() {
		System.out.println("------");
		System.out.println("상품생성");
		System.out.println("------");
		System.out.print("상품이름:");
		String name = scanner.next();
		System.out.print("잔고양:");
		int balance = scanner.nextInt();
		
		Stock acc = new Stock(name, balance);
		
		//[Stock][Stock][Stock][][][][][][][][][][][][][][][][]...[]
		
		stockArray[idx++] = acc;
		
		System.out.println("결과:상품이 생성되었습니다.");
	}
	//상품목록보기
	private static void StockList() {
		System.out.println("------");
		System.out.println("상품목록");
		System.out.println("------");
		
		//객체 참조타입 배열을 순차적으로 읽으면서 참조변수가 null이 아닐때만 출력.
		 for(int i=0;i<stockArray.length;i++) { //오류발생
			 Stock Stock =stockArray[i];
			 if(Stock!=null) {
				 System.out.println("상품목록:"+Stock.getitem());
				 System.out.println("상품이름:"+Stock.getname());
				 System.out.println("잔고양:"+Stock.getbalance());
				 System.out.println(Stock.toString()); //null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPointer오류발생
			 }
		  }
	}
	
	//입고하기
	private static void importing() {
		System.out.println("------");
		System.out.println("입고");
		System.out.println("------");
		System.out.print("상품번호");
		String item = scanner.next();
		System.out.print("입고양");
		int amount = scanner.nextInt();
		Stock acc = findStock(item);
		if (acc != null) {
			acc.setbalance(acc.getbalance() + amount);
            System.out.println("결과:입고가 성공되었습니다.");
		}else {
			System.out.println("결과:상품번호를 확인해주세요.");
		}
	}
     //출고하기	
	private static void exporting() {
		System.out.println("------");
		System.out.println("출고");
		System.out.println("------");
		System.out.print("상품번호");
		String ano = scanner.next();
		System.out.print("출고양");
		int amount = scanner.nextInt();
		Stock acc = findStock(ano);
		if (acc != null) {
			if (acc.getbalance() - amount >= 0) {
				acc.setbalance(acc.getbalance() - amount);
				System.out.println("결과:출고가 성공되었습니다.");
			}else {
				System.out.println("결과:잔고가 부족합니다.");
			}
		}else {
			System.out.println("결과:상품번호를 확인해주세요.");
		} 
	}
     // [Stock][Stock][null][null][Stock][null].....[null]
	//Stock 배열에서 ano와 동일한 Stock 객체 찾기-
	//참조타입 배열의 값 비교
	private static Stock findStock(String ano) {
		Stock Stock=null;//로컬변수
		for(int i=0;i<stockArray.length;i++) {
			  Stock =stockArray[i];
			if(Stock!=null) {  
			  if(Stock.getitem().equals(ano))
				break;//ano에 해당하는 객체 리턴
			}
		}
		return Stock;	//배열 전체를 찾아도 없으면 null리턴
	}
}