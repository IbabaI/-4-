package ch03;

public class Student {
	
	// �ʵ�
	String sno;
	String name;
	
	//������
	public Student() {}
	public Student(String sno) {
		   this.sno =sno;
		   
	}
		public Student(String sno, String name) {
			this.sno = sno;
			this.name = name;
	}
		public String getSno() {
			return sno;
		}
		public void setSon(String sno) {
			this.sno=sno;
	}
		public String getName() {
			return name;
		}
		
	//�޼ҵ�

}
