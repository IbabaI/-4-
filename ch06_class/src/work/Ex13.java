package work;

public class Ex13 {  //ex14 같이 해결됨

	public static void main(String[] args) {
		

		System.out.println("현실 세계의 회원을 Member클래스로 모델링하려고 합니다. 회원의 데이터로는 \r\n"
				+ "이름,아이디, 패스워드, 나이 가 있습니다. 이 데이터들을 가지는 Member클래스를 선언해보세요.");
		
		/*
		 * 데이터 이름            필드 이름             타입
            이름                 name               문자열
            아이디                id                 문자열
           패스워드              password            문자열
            나이                 age                 정수
		  */
		Member user1 = new Member("홍길동","hong");
		Member user2 = new Member("강자바","java");//default생성해야 사용가능
		
		user2.setId("java");
		user2.setName("강자바");
	}

}
class Member{
	//필드
	private String name;
	private String id;
	private String password;
	private int age;
	
	//생성자 -Ex14
	  public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	  //default생성
	  public Member() {	}
	  
	//메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}