package ch03_array;

public class Ex14_01 {

	public static void main(String[] args) {
		
		//ÂüÁ¶Å¸ÀÔ(String) 1Â÷¿ø ¹è¿­ ¼±¾û
		String[] snake = {"±¸··ÀÌ","ÆÈ··ÀÌ","Ä¥··ÀÌ","À°··ÀÌ","¿À··ÀÌ"};
		
		//Ãâ·Â
		for(int i=0; i<snake.length; i++)
			System.out.print(snake[i]+" ");
		System.out.println();
		
		for(int i=(snake.length-1); i>=0; i--)
			System.out.print(snake[i]+" ");
		System.out.println();
		
		
		//Çâ»óµÈ for¹®
		
		for(String n:snake)
			System.out.print(n+" ");
		System.out.println();

	}

}
