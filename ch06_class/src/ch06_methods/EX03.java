package ch06_methods;


public class EX03 {
	public static void main(String[] args) {
		 //3���� �޼ҵ� ȣ��
		Car1 c1 = new Car1();
		
		c1.setCc(1000);
		c1.setColor("red");
		c1.setKind("sonata");

}
}

class Car1{
	//�ʵ�
   String kind;
   int cc;
   String color;
    
   //3���� �޼ҵ� (�Ű����� o , ����Ÿ�� x )
    public void setKind(String kind) {
	this.kind = kind;
}
    //3���� 
    public void setCc(int cc) {
	this.cc = cc;
}
    //3���� 
    public void setColor(String color) {
	this.color = color;
} 
}