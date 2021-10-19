package work;

public class Ex03_Student {

	
	/*Student Ŭ������ �ۼ��ϵ�, Object�� equals()�� hashCode()�� �������̵��ؼ� Student��
�й�(studentNum)�� ������ ���� ��ü�� �� �� �ֵ��� �غ�����. Student Ŭ������ �ʵ�� ������ �����ϴ�.
hashCode()�� ���ϰ��� studentNum �ʵ尪�� �ؽ��ڵ带 �����ϵ��� �ϼ���.*/
	
	
	private String studentNum;
	
	public void Student(String studentNum) {
		this.studentNum =studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
// ���⼭ �ڵ带 �ۼ��ϼ���
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex03_Student) {
			Ex03_Student student =(Ex03_Student)obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
