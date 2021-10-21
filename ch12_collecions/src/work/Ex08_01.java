package work;

//������ Ǯ�� 
import java.util.HashSet;
import java.util.Set;

public class Ex08_01 {

	public static void main(String[] args) {
		System.out.println("HaxhSet�� Student��ü�� �����Ϸ��� �մϴ�. �й��� ������ ������ Student��� �����ϰ� �ߺ� ������ ���� �ʵ��� �ϰ� �ͽ��ϴ�.\r\n"
				+ "Student Ŭ�������� �������ؾ� �ϴ� hashCode()�� equals()�޼ҵ��� ������ ä��������. Student�� �ؽ��ڵ�� �й��̶�� �����մϴ�.");
		
		Set<Student> set= new HashSet<Student>();
				set.add(new Student(1, "ȫ�浿"));
				set.add(new Student(2, "�ſ��"));
				set.add(new Student(1, "���ο�"));   //�й��� �����Ƿ� ������� ����
				
		Integer<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" +student.name);
		}
		

	}

}
class Student {
	public int studentNum; //Ű
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
   
