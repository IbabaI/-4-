package ch01_generics;

public class GenericMethodExample {

	// T�� Ÿ�� �Ű� ������ ���׸� �޼ҵ�
		public static <T> GStack<T> reverse(GStack<T> a) { 	
			GStack<T> s = new GStack<T>(); 
			while (true) {
				T tmp; 
				tmp = a.pop(); // ���� ���ÿ��� ��� �ϳ��� ����
				if (tmp==null) // ������ �����
					break;
				else 
					s.push(tmp); // �� ���ÿ� ��Ҹ� ����
			}
			return s; // �� ������ ��ȯ
		}
}