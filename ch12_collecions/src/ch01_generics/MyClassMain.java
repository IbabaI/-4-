package ch01_generics;

public class MyClassMain {

	public static void main(String[] args) {
		//컴파일시 T -> Integer로 변환
		MyClass<Integer> s = new MyClass<Integer>();
		s.set(10); // 10->Integer10으로 오토박싱되어 들어감
		s.set(new Integer(10));
		System.out.println(s.get());

		//컴파일시 T ->String으로 변환
		MyClass<String> s1 = new MyClass<String>();
		s1.set("hello");
		System.out.println(s1.get());
		
		MyClass<Double> s2 = new MyClass<Double>();
		s2.set((double) 10); // 10->Double10으로 오토박싱되어 들어감
		s2.set(new Double(10));
		System.out.println(s2.get());

	}

}
