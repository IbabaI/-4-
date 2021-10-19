package work;

import java.text.DecimalFormat;

public class Stock02 {

	static final String itemNo="111-00";
	static int seq=0;
	private String item;
	private String name;
	private int qty;
	
	{  // �ν��Ͻ� �ʱ�ȭ ��
		
		seq++;
		DecimalFormat df = new DecimalFormat("000"); //��ü ���ڸ� ���ڿ� ����ִ� �κ��� "0"���� ä��
	//	df.format(seq);
		item=itemNo + "-"+ df.format(seq);
	}
	
	
	
	//������ - Source ->Generate Constructor using Fields
	public Stock02(String item, String product, int qty) {
		super();
		this.item = item;
		this.name = name;
		this.qty = qty;
	}
	
 // Source -> Generate Getters and Setters
	
	//������
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
	
	//Account ���� ��� �޼ҵ�
		@Override
		public String toString() {
			return "Stock [item=" + item + ", name=" + name + ", qty=" + qty + "]";
		}
}
