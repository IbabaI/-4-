package work;

public class Ex04_Member {
	
	/*Member클래스를 작성하되, Object의 toString()메소드를 오버라이딩해서 MemberExample클래스의 실행결과처럼
나오도록 작성해보세요.*/

	private String id;
	private String name;
	
	public void Member(String id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		
		return id + ":" +name;
	}
	
	//여기서 코드를 작성하세요
	

}
