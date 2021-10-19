package work;

public class Ex14 {

	//13번에서 작성한 Member클래스(Ex13클래스)에 생성자를 추가하려고 합니다.
	//다음과 같이 Member객체를 생성할 때 name필드와 id필드를 외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언해야 합니까?
	
	Ex14 user1 = new Ex14("홍길동","hong");
	Ex14 user2 = new Ex14("강자바","java");
	
	String name;
	  String id;
	  String password;
	  int age;
	  
	  Ex14(String name, String id) {
		  this.name= name;
		  this.id = id;
	  }

}
