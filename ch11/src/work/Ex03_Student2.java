package work;
//������ Ǯ��
import java.util.HashMap;

import ch01_Object.Student;

public class Ex03_Student2 {

	public static void main(String[] args) {
		
		/*Student Ŭ������ �ۼ��ϵ�, Object�� equals()�� hashCode()�� �������̵��ؼ� Student��
		�й�(studentNum)�� ������ ���� ��ü�� �� �� �ֵ��� �غ�����. Student Ŭ������ �ʵ�� ������ �����ϴ�.
		hashCode()�� ���ϰ��� studentNum �ʵ尪�� �ؽ��ڵ带 �����ϵ��� �ϼ���.*/
			
			
			// ���⼭ �ڵ带 �ۼ��ϼ���
			//student Ű�� ������ �����ϴ� �ؽ��� ��ü ����
			HashMap<Student, String> hashMap = new HashMap<>();
			
			//new Student("1")�� ���� 95�� ����
			hashMap.put(new Student("1"), "95");
					
			//new Student("1")�� ������ �о��
			String score = hashMap.get(new Student("1"));
			System.out.println("1�� �л��� ����: "+ score);
			
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
	public boolean equals(Object obj) { //��ü�� promotion
		if(obj instanceof Student) { //������
		return this.equals(((student)obj).getStudentNum()); //casting
	  }
		return false;
	}
	
}
   
  
