package work;
//선생님 풀이
import java.util.HashMap;

import ch01_Object.Student;

public class Ex03_Student2 {

	public static void main(String[] args) {
		
		/*Student 클래스를 작성하되, Object의 equals()와 hashCode()를 오버라이딩해서 Student의
		학번(studentNum)이 같으면 동등 객체가 될 수 있도록 해보세요. Student 클래스의 필드는 다음과 같습니다.
		hashCode()의 리턴값은 studentNum 필드값의 해시코드를 리터하도록 하세요.*/
			
			
			// 여기서 코드를 작성하세요
			//student 키로 총점을 저장하는 해쉬맵 객체 생성
			HashMap<Student, String> hashMap = new HashMap<>();
			
			//new Student("1")의 점수 95를 저장
			hashMap.put(new Student("1"), "95");
					
			//new Student("1")로 점수를 읽어옴
			String score = hashMap.get(new Student("1"));
			System.out.println("1번 학생의 총점: "+ score);
			
			}
	}
	

class student {

	private String studentNum;
	
	public student(String studentNum) {
		this.studentNum =studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
}
	//1. hashCode()

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	 //2. equals()

	@Override
	public boolean equals(Object obj) { //객체의 promotion
		if(obj instanceof Student) { //다형성
		return this.equals(((student)obj).getStudentNum()); //casting
	  }
		return false;
	}
	
}
   
  
