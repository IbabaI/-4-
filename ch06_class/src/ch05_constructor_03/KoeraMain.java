package ch05_constructor_03;

public class KoeraMain {

	public static void main(String[] args) {
		
		Korean korean1 = new Korean("홍길동","011203-1231230");
		
		System.out.println(korean1.name);
		System.out.println(korean1.sno);
		
		Korean korean2 = new Korean("일지매","932933-3421411");
		System.out.println(korean2.name);
		System.out.println(korean2.sno);

	}

}
