package ch01_Object;

public class Student {
	//thread, collection, network, file입출력
	public String id;
		
	public Student(String id) {
		this.id = id;
	}
	
	//Object로 부터 상속받은 equals메소드를 재정의하여 논리적 동등 여부 만들기
	@Override
	public boolean equals(Object obj) {
		//비교시
		//같은 타입이 아니면 false
		if(obj instanceof Student) {
			//같은 타입이면 id값 끼리 비교한 결과 true/false
		return this.id.equals(((Student)obj).id);
		}
		return false;
	}
}
