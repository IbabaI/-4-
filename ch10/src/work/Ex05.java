package work;

public class Ex05 {

	public static void main(String[] args) {
		
		System.out.println("다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?");
//  public void method1() throws NumberFormatException, ClassNotFoundExceprion{...}

		System.out.println("1) try {method1();}catch(Exception){}");
		System.out.println("2) void method2() throws Exception {method1();}");
		System.out.println("3) try{mehtod1();} catch(Exception e){} catch(ClassNotFoundException e){}      -  x");
		System.out.println("4) try{method1();) catch(ClassNotFoundException e) {} catch(NumberFormatException e){}");

	}

}
