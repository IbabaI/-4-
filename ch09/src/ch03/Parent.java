package ch03;

public interface Parent {
   void parentmethod();
}

class Child implements Parent{
	//구현클래스에서 추가된 멤버
	int childF; //필드
	void childM() {}//메소드
	//구현클래스에서 재정의된 메소드 - 원래 인터페이스에서 선언되어있는 메소드
	@Override
	public void parentmethod() {
		childF=3;
		childM();
		
	}
	
}
