package work;

import java.util.TreeSet;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("TreeSet에 Student객체를 저장하려고 합니다. Student의 score필드값으로 자동 정렬하도록 구현하고 싶습니다.\r\n"
				+ "TreeSet의 last()메소드를 호출했을 때 가장 높은 score의 Student객체가 리턴되도록 Student클래스를 완성해보세요.");
		
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student1("blue", 96));
	    treeSet.add(new Student1("hong", 86));
	    treeSet.add(new Student1("white", 92));

	    Student1 student = treeSet.last();
	    System.out.println("최고점수 : " + student.score);
	    System.out.println("최고점수를 받은 아이디 : " + student.id);

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
		//코드작성
    	
   	if(score < o.score) 
    		return -1;
    	else if(score == o.score)return 0;
    	else return 1;
   }*/
	
	
	
	
	
}