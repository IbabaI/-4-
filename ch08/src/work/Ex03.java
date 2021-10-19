package work;

public class Ex03 {
  
  /*다음은 Soundable 인터페이스입니다. sound()추상 메소드는 객체의 소리를 리턴합니다.
 public interface Soundable{
    String sound();
}

SoundableExample클래스에서 printSound()메소드는 Soundable인터페이스 타입의 매개변수를 가지고 있습니다.
main()메소드에서 printSound()를 호추할 때 Cat 과 Dog 객체를 주고 실행하면 각각 "야옹"과 "멍멍"이 출력되도록
Cat과 Dog 클래스를 작성해보세요.
   * 
   * */
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());

	}

	   
   }

// 결과 값 : 야용, 멍멍