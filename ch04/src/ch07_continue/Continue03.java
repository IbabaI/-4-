package ch07_continue;

public class Continue03 {

	public static void main(String[] args) {
		
		for(int i=0; i<=9; i++) {
			System.out.println("i=" + i + "\t");
			for(int j=0; j<=9; j++) {
				System.out.print("j=" +j);
				if(j>2) continue; //continue를 감싸는가장 가까운 블럭의 for시작으로 이동
				System.out.print("나도 출력되나 \t");
			} 
			System.out.println(); // 한줄 아래로 내리기
		}

	}

}
