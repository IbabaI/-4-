package ch07_continue;

public class BreakOutterExam01 {

	public static void main(String[] args) {
		
		//char타입
		for(char upper='A'; upper<='z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.print(upper + "-" +lower +"\t");
				if(lower=='g')
					break;
			}System.out.println();
		}
      System.out.println("프로그램 종료");
	}

}
