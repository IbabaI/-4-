package work;

import java.util.TreeSet;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("TreeSet�� Student��ü�� �����Ϸ��� �մϴ�. Student�� score�ʵ尪���� �ڵ� �����ϵ��� �����ϰ� �ͽ��ϴ�.\r\n"
				+ "TreeSet�� last()�޼ҵ带 ȣ������ �� ���� ���� score�� Student��ü�� ���ϵǵ��� StudentŬ������ �ϼ��غ�����.");
		
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student1("blue", 96));
	    treeSet.add(new Student1("hong", 86));
	    treeSet.add(new Student1("white", 92));

	    Student1 student = treeSet.last();
	    System.out.println("�ְ����� : " + student.score);
	    System.out.println("�ְ������� ���� ���̵� : " + student.id);

	}

}
class Student1 implements Comparable<Student1>{
	String id;
	int score;
	
	public Student1(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	public int compareTo(Student1 o) {
		return this.score-o.score;
	}
}
	
	 /*
    @Override
	public int compareTo(Student1 o) {
		//�ڵ��ۼ�
    	
   	if(score < o.score) 
    		return -1;
    	else if(score == o.score)return 0;
    	else return 1;
   }*/
	
	
	
	
	
}