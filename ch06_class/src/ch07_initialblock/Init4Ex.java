package ch07_initialblock;

public class Init4Ex {

	public static void main(String[] args) {
		
		Product p1 = new Product();
	  }

	}

class Product {
	// static필드
	static int cnt;
	// 인스턴스 필드
	int serialNo;
	// 인스턴스 초기화 블럭
	{
		cnt++; // static필드 증가
		serialNo=cnt; //증가된 static필드 값을 객체 생성시 각 인스턴스 변수에 저장
	}
	// 인스턴스 메소드
	void print() {
		System.out.println("제품 번호: "+serialNo);
	}
}