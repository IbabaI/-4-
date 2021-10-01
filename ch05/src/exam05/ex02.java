package exam05;

public class ex02 {

	public static void main(String[] args) {
		
		System.out.println("자바에서 메모리 사용에 대한 설명으로 틀린것");
		
        System.out.println("1)로컬 변수는 스택 영역에 생성되며 실행 블록이 끝나면 소멸된다.");
        System.out.println("2)메소드 코드나, 상수, 열거 상수는 정적(메소드)영역에 생성된다.");
        System.out.println("3)참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다.  - x");
        System.out.println("4)배열 및 객체는 힙 영역에 생성된다.");
	
	// 참조하는 변수나 필드가 없다면 의미 없는 객체가 되기 때문에 이것을 쓰레기로 취급하고
    // JVM은 쓰레기 수집기(farbage Collector)를 실행시켜 쓰레기 객체를 힙 역역에서 자동으로 제거한다.
        
	
	}

}
