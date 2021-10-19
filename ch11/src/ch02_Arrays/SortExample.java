package ch02_Arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		
		Member m1 = new Member ("홍길동");
		Member m2 = new Member ("박동수");
		Member m3 = new Member ("김민수");
		Member[] members = {m1,m2,m3};
		//오름차순 정렬
		Arrays.sort(members);
		for(Member m:members)
			System.out.println(m);
	}

}
// sort메소드 사용하는 객체는 Comparable인터페이스로 구현된 객체만 가능 
class Member implements Comparable<Member>{
    String name;
    
	public Member(String name) {
	
		this.name = name;
	}




	@Override
	public int compareTo(Member o) {
		
		return name.compareTo(o.name); //홍길이,홀길동
	}
	
}