package work;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데, Child 클래스의 생성자에서 컴파일 에러가 발생했습니다. 그 이유를 설명해보세요.");
	}
	/* 부모생성자에 default생성자가 없어서 오류 발생 */	
	public class Parent {
		
        public String name;
		
        // public parent(){} //1번째 방법
		public Parent(String name) {
			this.name = name;
		}
	}
public class Child extends Parent{
	private int studentNo;
	
	// 매개변수 2개짜리 생성자
	public Child(String name, int studentNo) {
//		this.name = name;  //오류원인 - 삭제
		super(name);  // 새로 넣은것 2번째 방법
		this.studentNo = studentNo;
	}
}
}