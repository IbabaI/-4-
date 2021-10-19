package work;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println("생성자에 대한 설명으로 틀린것");
		
		System.out.println("1)객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다.  -  x");
		//싱글톤 Single.getInstance(); => Single instance = new single();
		System.out.println("2)생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다.");
		System.out.println("3)생성자가 선언되지 않으면 컴파일러가 기볹 생성자를 추가한다.");
		System.out.println("4)외부에서 객체를 생성할 수 없도록 생성자에 private접근 제한자를 붙일 수 있다.");
		
		//생성자를 실행시키지 않고는 클래스로부터 객체를 만들 수 없다.
		//만약 생성자가 성공적으로 실행되지 않고예외(에러)가 발생했다면 객체는 생성되지 않는다.
		

	}

}
