package ch02_Object.copy;

import java.util.Objects;

public class EqualsAnsDeepEqualsEx {

	public static void main(String[] args) {
		//int Ÿ���� ��üȭ�� Ŭ����
		Integer o1 = 1000;
		Integer o2 = 1000;

		//�� ��ü�� ����.
		System.out.println(Objects.equals(o1, o2));//(a==b) || (a != null && a.equals(b))
		
		//�� ��ü�� �ʵ峻�뵵 ����.
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
