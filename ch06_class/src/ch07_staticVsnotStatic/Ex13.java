package ch07_staticVsnotStatic;

public class Ex13 {

	public static void main(String[] args) {
		Car1 c1 = new Car1("쏘나타",2000,"빨강");
		c1.print();

	}

}
class Car1 {
	//필드
	String kind;
	int cc;
	String color;
	
	//생성자 - this.인스턴스자신을 가리킴. 로컬변수와 필드구분용 this.
	Car1(String kind, int cc, String color ) {
		this.kind=kind; this.cc=cc; this.color=color;   //this.kind=kind 에서 뒤에 this가 없는건 로컬변수라고 한다.
		
	}
	// kind, cc, color는 필드
	void print() {
		System.out.println("차종: "+kind);
		System.out.println("배기량: "+cc);
		System.out.println("색상: "+color);
	}
}