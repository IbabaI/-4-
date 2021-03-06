package work;

public class Ex11 {
/*숫자 100과 300으로 각각 박싱된 Integer객체를 ==연산자로 비교했습니다.
100을 박싱한 Integer객체는 true가 나오는데, 300을 박싱한 Integer객체는
false가 나오는 이유를 설명해보세요.*/
	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4); //p.532
		
		//byte, short, int타입의 값의 비교범위  128~127까지는 == 연산자로 비교 가능
		//범위를 벗어나면 equals()메소드를 사용해야함.
		System.out.println(obj3.equals(obj4));

	}
//실행값 : true, false
}
//이것이 자바다 1권 532p참조