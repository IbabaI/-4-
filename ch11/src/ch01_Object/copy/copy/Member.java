package ch01_Object.copy.copy;

//thread, collection, network, file입출력
public class Member {

	private String name;
	private int age;
			
	public Member(String name, int age) {
		this.name=name;
		this.age = age;
	}
	public String getName() { return name;}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { 
		this.age=age;
	}
	//2.equals 비교
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				return this.name.equals(((Member)obj).getName()) && this.age==((Member)obj).getAge();
				
			}
			return false;
		}
		//3.hashcode 비교
		@Override
		public int hashCode() {
			
			return name.hashCode()+age;
		}
	}


