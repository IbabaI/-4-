package ch07_final;

//a - b - c - ch07_final 
//a.b.c.ch07_fianl.Person
//ch07_final.Person

public class Person01 {
	
//final�ʵ�� ����� ���ÿ� �ʱ�ȭ
final String nation="Korea";
//�����ڿ��� final�ʵ带 �ʱ�ȭ�Ҽ� �ִ� ��� ���� �س��� ���� �߻����� ����.
final String ssn;
String name;
//�����ڿ� final�ʵ带 �ʱ�ȭ �ϴ� ��ɹ� ����.

public Person01(String ssn, String name) {
	this.ssn = ssn;
	this.name = name;
}

public static void main(String[] args) {
	Person01 person = new Person01("20010101-1234567","ȫ�浿");
		//person.nation="usa";
		//person.ssn="1234";
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		Person01 person2 = new Person01("20010101-2234567","ȫ�浿");
	} 
}
