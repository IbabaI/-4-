package ch07_continue;

public class BreakOutterExam01 {

	public static void main(String[] args) {
		
		//charŸ��
		for(char upper='A'; upper<='z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.print(upper + "-" +lower +"\t");
				if(lower=='g')
					break;
			}System.out.println();
		}
      System.out.println("���α׷� ����");
	}

}
