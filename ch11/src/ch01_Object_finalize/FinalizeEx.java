package ch01_Object_finalize;

public class FinalizeEx {

	public static void main(String[] args) {
		
		Counter counter = null;
		
		long startTime = System.currentTimeMillis();
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			// 참조변수와 객체 연결해제
			counter = null;
			// gc호출
			System.gc();
		}//GC는 메모리의 모든 쓰레기 객체를 소멸하지 않음, GC의 구동 시점이 일정하지 않음


		long endTime = System.currentTimeMillis();
		System.out.println("소요시간: "+(endTime-startTime)+"ms");
	}

}
