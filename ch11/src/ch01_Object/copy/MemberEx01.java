package ch01_Object.copy;

public class MemberEx01 {

	public static void main(String[] args) {
		
				
		//물리적 다른 객체
		Member member1 = new Member(2001001);
		Member member2 = new Member(2001001);

		
		//논리적 동등
		System.out.println(member1.equals(member2));
	}

}
