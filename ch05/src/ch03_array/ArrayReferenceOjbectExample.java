package ch03_array;

public class ArrayReferenceOjbectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		
		// 배열내 저장된 참조객체의 주소가 같은지 비교/ 내용이 같은 지 비교
		// String타입 객체 생성 1. 변수="문자리터럴"; 2.변수=new string("문자리터럴")
		//"Java" -> 객체로 생성
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		//new String("Java") 객체 생성
		strArray[2] = new String("Java");
		
		//동일 객체 참조여부확인 연산 ==
		System.out.println(strArray[0]==strArray[1]?"같은객체 참조":"다른객체참조"); //true
		System.out.println(strArray[0]==strArray[2]?"같은객체 참조":"다른객체참조"); //false

		//참조하고 있는 객체의 내용이 같은지 비교하는 방법
		//논리적 동등(quivalence) 비교 -동등: 물리적으로 같지않지만 내용이 같다.
		System.out.println(strArray[0].equals(strArray[1])?"참조하는 객체의 내용이 같다":"참조하는 객체의 내용이 다르다"); 
		System.out.println(strArray[0].equals(strArray[2])?"참조하는 객체의 내용이 같다":"참조하는 객체의 내용이 다르다"); 
		
		//참조하고 있는 객체의 내용이 같으므로 hashCode()값이 같음
		System.out.println(strArray[0].hashCode());
		System.out.println(strArray[1].hashCode());
		System.out.println(strArray[2].hashCode());
		
		//물리적 저장공간의 참조주소 확인
		System.out.println(System.identityHashCode(strArray[0].hashCode()));
		System.out.println(System.identityHashCode(strArray[1].hashCode()));
		System.out.println(System.identityHashCode(strArray[2].hashCode()));
		
	}

}
