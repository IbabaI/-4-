package ch07_continue;

public class BreakOutterExam02 {

	public static void main(String[] args) {
		
		//charŸ��
		outter :for(char upper='A'; upper<='z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.print(upper + "-" +lower +"\t");
				if(lower=='g')
					break outter;
			}
		}
      System.out.println("���α׷� ����");
	}

}
