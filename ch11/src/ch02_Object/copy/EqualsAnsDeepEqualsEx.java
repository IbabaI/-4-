package ch02_Object.copy;

import java.util.Objects;

public class EqualsAnsDeepEqualsEx {

	public static void main(String[] args) {
		//int 타입을 객체화한 클래스
		Integer o1 = 1000;
		Integer o2 = 1000;

		//두 객체가 같다.
		System.out.println(Objects.equals(o1, o2));//(a==b) || (a != null && a.equals(b))
		
		//두 객체의 필드내용도 같다.
		System.out.println(Objects.deepEquals(o1, o2));
		
		/*if (a==b)
		 * return true;
		 * else if (a == null || b == null)
		 * return false;
		 * else
		 * return Arrays.deepEquals(a,b);
		 * 
		 */
		Integer[] arr1= {1,2};
		Integer[] arr2= {1,2};
		
		
		
	}

}
