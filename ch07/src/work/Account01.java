package work;

public class Account01 {

	static final String serialNo="111-001";
	static int seq=0;
	private String serial;
	private String product;
	private int qty;
	
	//생성자 - Source ->Generate Constructor using Fields
	public Account01(String serial, String product, int qty) {
		super();
		this.serial = serial;
		this.product = product;
		this.qty = qty;
	}
 // Source -> Generate Getters and Setters
	public String getSerial() {
		return serial;
	}

	public void setSerial(String qty) {
		this.serial = serial;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	//Account 정보 출력 메소드
		@Override
		public String toString() {
			return "Account [serial=" + serial + ", product=" + product + ", qty=" + qty + "]";
		}
}
