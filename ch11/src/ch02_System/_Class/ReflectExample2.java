package ch02_System._Class;

import java.util.Scanner;

public class ReflectExample2 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("실행할 객체를 입력하세요>");
	String className = "ch02_System_Class."+scanner.next();
	
	//클래스 정보 로딩
	Class clazz 
= Class.forName("ch02_System_Class.ReceiveAcction");
  System.out.println(clazz.getName());
  //Action action = new ReflectAcction();
 // 로딩된 클래스 정보로 객체 생성 newInstance(); 후,  promotion
  Action action =(Action)clazz.newInstance();
  action.execute();
  
	}
}