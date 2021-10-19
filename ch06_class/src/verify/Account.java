package verify;

public class Account {

	static final String bankNo="1111";
	static int seq=0;
	private String ano;
	private String owner;
	private int balance;
	
	//생성자 - Source ->Generate Constructor using Fields
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
 // Source -> Generate Getters and Setters
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	//Account 정보 출력 메소드
		@Override
		public String toString() {
			return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
		}
}
