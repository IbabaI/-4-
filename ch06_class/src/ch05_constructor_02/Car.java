package ch05_constructor_02;

public class Car {
	
	String model;
	String color;
	int maxSpeed;
  Car(String model, String color, int maxSpeed) {
	  this.model=model;
	  this.color=color;
	  this.maxSpeed=maxSpeed;
  }

}
/* Ŀ���Ͻ� Car(�Ű�����,1 �Ű�����2, �Ű�����3,....) {}
 * �����ڰ� �����ϹǷ� Ŭ�������Ͽ� �⺻�����ڸ� �߰����� ����.
 * 
 * public class Car {
	X -> Car(){} �⺻�����ڸ� �߰����� ����.
	String model;
	String color;
	int maxSpeed;
  Car(String model, String color, int maxSpeed) {
	  this.model=model;
	  this.color=color;
	  this.maxSpeed=maxSpeed;
 * 
 * */
