package work;

//선생님 풀이 
import java.util.HashSet;
import java.util.Set;

public class Ex08_01 {

	public static void main(String[] args) {
		System.out.println("HaxhSet에 Student객체를 저장하려고 합니다. 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않도록 하고 싶습니다.\r\n"
				+ "Student 클래스에서 재정의해얗 하는 hashCode()와 equals()메소드의 내용을 채워보세요. Student의 해시코드는 학번이라고 가정합니다.");
		
		Set<Student> set= new HashSet<Student>();
				set.add(new Student(1, "홍길동"));
				set.add(new Student(2, "신용권"));
				set.add(new Student(1, "조민우"));   //학번이 같으므로 저장되지 않음
				
		Integer<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" +student.name);
		}
		

	}

}
class Student {
	public int studentNum; //키
	public Stirng name;
	
	public Student (int StudentNum,Stirng name) {
		this.studentNum=studentNum;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		return this.studentNum==((Student)obj).studentNum;
	}

	
	}
   
