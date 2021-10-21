package ch01_generics;

public class GenericMethodExample {

	// T가 타입 매개 변수인 제네릭 메소드
		public static <T> GStack<T> reverse(GStack<T> a) { 	
			GStack<T> s = new GStack<T>(); 
			while (true) {
				T tmp; 
				tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
				if (tmp==null) // 스택이 비었음
					break;
				else 
					s.push(tmp); // 새 스택에 요소를 삽입
			}
			return s; // 새 스택을 반환
		}
}