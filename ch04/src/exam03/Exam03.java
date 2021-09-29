package exam03;

public class Exam03 {
	/*삼항연산*/ 
	public static void main(String[] args) {
		
		// 다음 코드를 실행했을 때 출력 결과는 무엇입니까?
		
		int score = 85;
        String result =  (!(score>90)) ? "가" : "나";
	    System.out.println(result);
	    
	    // 가 => 85 > 90 == false , (!(85>90)) == true

	}

}
