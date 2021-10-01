package ch05_constructor_03;

//멤버-필드,생성자,메소드
public class Korean {

	String name;
	String sno;
	// 생성자 -
	//default 생성자가 아닌 매개변수 2개짜리  생성자 선언
	//역할: 객체(instance)생성시 name과 sno를 초기화하는 역할
	public Korean(String irum, String jumin) {
		
		name = irum;
		sno = jumin;
	}
	
}
/* 컴파일 후
 * public class Korean{
 * //필드 
 * String name;
	String sno;
	//생성자 - 
 *  public class Korean() {}
 *  }
 * */
 