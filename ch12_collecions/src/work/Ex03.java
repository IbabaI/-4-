package work;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("Set �÷��ǿ� ���� ���� �� Ʋ�� ���� �����Դϱ�?");
		
		System.out.println("1)��ǥ���� ���� Ŭ�����δ� HashSet, LinkedHashSet, TreeSet�� �ִ�.");
		System.out.println("2)Set�÷��ǿ��� ��ü�� �ϳ��� �������� �ʹٸ� Iterator�� �̿��Ѵ�.");
		System.out.println("3)HashSet�� hashCode()�� equals()�� �̿��ؼ� �ߺ��� ��ü�� �Ǻ��Ѵ�.");
		System.out.println("4)Set�÷��ǿ��� null�� ������ �� ����.   -   x  ");

		Set<String> set = new HashSet<>();
		set.add("hello");
		set.add(null);
		set.add("hi");
		
		System.out.println(set.toString());
	}

}
