package work;

public class Stock {
	
	static final String itemNo = "111-00";
	static int seq = 0;
	private String item;
	private String name;
	private int qty;

	{
		seq++;
		item = itemNo + seq;
	}

	public Stock(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Stock [상품번호: " + item + ", 상품명: " + name + ", 재고: " + qty + "]";
	}

}