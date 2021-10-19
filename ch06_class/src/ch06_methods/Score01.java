package ch06_methods;

public class Score01 {
	
	//필드
	int kor;
	int eng;
	int math;
	
	//4유형 (매개변수x, 리턴타입x)
	void display() {
		int sum = kor + eng+ math;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum/3);
	}//4유형 (매개변수x, 리턴타입x)
	void print() {
		System.out.println(kor+ "\t"+eng+"\t"+math);
	}
	// 3유형 (매개변수o, 리턴타입x)
	void print(int kor, int eng, int math) {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	//1유형 (매개변수o, 리턴타입o)
	int res(int kor, int eng, int math) {
		return kor + eng+math;
	}
	//2유형 (매개변수x, 리턴타입o)
	int res() {
		return kor+eng+math;
	}

}
