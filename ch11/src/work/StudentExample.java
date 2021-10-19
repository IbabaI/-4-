package work;

import java.util.HashMap;

import ch01_Object.Student;

public class StudentExample {

	public static void main(String[] args) {
		
		///StudeHashMap<K, V>점을 저장하는 HashMap객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		//new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: "+ score);

	}
// 출력값 : 1번 학생의 총점 : 95
}
