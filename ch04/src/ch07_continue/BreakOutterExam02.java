package ch07_continue;

public class BreakOutterExam02 {

	public static void main(String[] args) {
		
		//char타입
		outter :for(char upper='A'; upper<='z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.print(upper + "-" +lower +"\t");
				if(lower=='g')
					break outter;
			}
		}
      System.out.println("프로그램 종료");
	}

}
