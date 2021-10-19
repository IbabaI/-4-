package work;

public class Ex06_01 {

	public static void main(String[] args) {
		
		
		System.out.println("Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다. \r\n"
				+ "ChildExample 클래스를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.");
		Child2 child = new Child2();
	}
		
		public class Parent2 {
			public String nation;
			
			public Parent2() {
				this("대한민국");
				System.out.println("Parent() call");
			}
			
			public Parent2(String nation) {
				this.nation = nation;
				System.out.println("Parent2(String nation) call");		
			}

	}

}
public class Child2 extends Parent2{
	private String name;
	
	public Child2() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child2(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
/*
 * 
 * Parent(String nation) call

Parent() call

Child(String name) call

Child() call
 * 
 * 1. 먼저 Child 클래스 타입인 child라는 이름을 가진 객체를 Child() 생성자를 사용해서 만들어낸다.
 

2. 이 때 Child는 Parent를 상속받는 클래스이므로 Parent의 기본 생성자인 parent()가 호출된다.

3. Parent의 기본 생성자를 살펴보면 String nation을 파라미터로 갖는 Parent의 다른 생성자에 "대한민국"을 전달한다.

4. parent(String nation) 생성자가 실행되면 문자열 변수인 nation을 "대한민국"으로 초기화한다.

5. 그리고 "Parent(String nation) call"을 출력한다.

6. parent(String nation) 생성자의 역할이 다 끝났으므로 다시 기본 생성자로 돌아가 "Parent() call"을 출력한다.

7. Parent 객체가 정상적으로 생성되었으니 이제 Child의 기본 생성자가 호출된다.

8. 3~6번의 과정이 child() 생성자에서 동일하게 수행된다.*/