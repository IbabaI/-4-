package work;

import java.text.DecimalFormat;

public class Stock02 {

	static final String itemNo="111-00";
	static int seq=0;
	private String item;
	private String name;
	private int qty;
	
	{  // 인스턴스 초기화 블럭
		
		seq++;
		DecimalFormat df = new DecimalFormat("000"); //전체 세자리 숫자외 비어있는 부분을 "0"으로 채움
	//	df.format(seq);
		item=itemNo + "-"+ df.format(seq);
	}
	
	
	
	//생성자 - Source ->Generate Constructor using Fields
	public Stock02(String item, String product, int qty) {
		super();
		this.item = item;
		this.name = name;
		this.qty = qty;
	}
	
 // Source -> Generate Getters and Setters
	
	//생성자
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getItem() {
		return item;
	}
	public String getName() {
		return name;
	}
	public Stock02(String product, int qty) {
		this.name = name;
		this.qty = qty;
	}
	
	//Account 정보 출력 메소드
		@Override
		public String toString() {
			return "Stock [item=" + item + ", name=" + name + ", qty=" + qty + "]";
		}
}
