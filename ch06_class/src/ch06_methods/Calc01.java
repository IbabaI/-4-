package ch06_methods;

public class Calc01 {
	// 필드
	int i=0,j=0;
	
	//합(매개변수o, 리턴타입o)
	int add(int x, int y) {
		return x+y;
	}
	//나누기(매개변수x, 리턴타입o)
public	int divid() {
		return i/j;
	}
    //빼기(매개변수o, 리턴타입x)
public void sub(int x, int y) {
	System.out.println(x-y);
	}
    //곱하기(매개변수x, 리턴타입x)
public void mul() {
	System.out.println(i*j);
}
}
