package ch01_06;

public class SuperEx01 {

	public static void main(String[] args) {
		
		ColorPoint cp= new ColorPoint(5,6,"red");
		cp.showColorPoint();
	}

}
class Point {
	private int x, y; //������ �����ϴ� x, y��ǥ
	public void set(int x, int y) {
		this.x=x; this.y=y;
	}
	public void showPoint() { //���� ��ǥ ���
		System.out.println("("+ x + "," + y + ")");
	}
}
class ColorPoint extends Point {
	//�߰��� �ʵ�
	private String color; // ���� ��
	
	//�߰��� �޼ҵ�
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //�÷� ���� ��ǥ ���
		System.out.println(color); showPoint();
}
}