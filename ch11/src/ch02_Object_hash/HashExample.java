package ch02_Object_hash;

import java.util.Objects;

public class HashExample {

	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홀길동");
		System.out.println(s1.hashCode());
		
		//매개변수의 hashCode()호출
		System.out.println(Objects.hashCode(s2));// o != null ? o.hashCode() :0;

	}
	static class Student {
		int sno;
		String name;
		public Student(int sno, String name) {
			this.sno=sno;
			this.name=name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno,name); // sno의 해시코드, name의 해시코드
			//return this.sno+this.name.hashCode();
		}
		
	}

}
