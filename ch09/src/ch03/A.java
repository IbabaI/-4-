package ch03;

public class A {

	//필드를 선언하고 자식(구현체)으로 초기화
	Parent p = new Child(); //promotion
	
	void method() {
		//구현체에서 추가된 멤버는 부모타입으로 변환후 접근 불가
//		p.childF=3;
//		p.childM();
		
		//자식클래스에서 재정의된 메소드는 부모타입으로 변환후 접근 가능 - 재정의된 내용으로 실행
		p.parentmethod();
	}
	//무명인터페이스 선언
	//구현체(상속)를 만들어서 Parent타입으로 promotion한 상태
	Parent p2 = new Parent() {
       
		//구현클래스에서 추가된 멤버
		int childF; //필드
		void childM() {}//메소드
		
		@Override
		public void parentmethod() {
			childF=3;
			childM();
			
		}
		
	};
	
	void method2() {
		p2.parentmethod();
	}
}
