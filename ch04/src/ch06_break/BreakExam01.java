package ch06_break;

public class BreakExam01 {

	public static void main(String[] args) {
		
		// Lable ¹«ÀÇ¹Ì
		for(int i=1; i<10; i++) {
			for(int j=1; j<=10; j++) {
				if(j==5) break;
				for(int k=1; k<=10; k++) {
					System.out.println(i+ "," +j+ "," +k);
				}
				System.out.println();
			}System.out.println();
		}

	}

}
