package ch01;

public interface G1 {

	//G1(){} // 사용불가. 실체 없음. 객체생성 못함
	int a  = 10; //static final
	void a(); // public abstract
}

//구현
class G2 implements G1{
	@Override
	public void a() {
		System.out.println("aa");
	}
}

class G3 implements G1{
	@Override
	public void a() {
		System.out.println("bb");
	}
}