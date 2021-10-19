package ch01_06;

public class SuperEx01 {

	public static void main(String[] args) {
		
		ColorPoint cp= new ColorPoint(5,6,"red");
		cp.showColorPoint();
	}

}
class Point {
	private int x, y; //한점을 구성하는 x, y좌표
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() { //점의 좌표 출력
		System.out.println("("+ x + "," + y + ")");
	}
}
class ColorPoint extends Point {
	//추가된 필드
	private String color; // 점의 색
	
	//추가된 메소드
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //컬러 점의 좌표 출력
		System.out.println(color); showPoint();
}
}