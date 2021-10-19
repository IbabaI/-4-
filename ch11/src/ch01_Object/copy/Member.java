package ch01_Object.copy;

public class Member {

	//thread, collection, network, file입출력
	int sno;
		
	public Member(int sno) {
		this.sno = sno;
	}
	public boolean equals(Object obj) {
		//1.동일타입이면
		if(obj instanceof Member) {//2.필드값 끼리 비교
			return this.sno==((Member)obj).sno; //3.필드값끼리 비교 결과 true/false리턴
		}// 동일타입아니면 무조건 false;
		return false;
	}
	
}

