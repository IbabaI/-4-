package work;

public class Ex06_01 {

	public static void main(String[] args) {
		
		
		System.out.println("Parent Ŭ������ ��ӹ޾� Child Ŭ������ ������ ���� �ۼ��߽��ϴ�. \r\n"
				+ "ChildExample Ŭ������ �������� �� ȣ��Ǵ� �� Ŭ������ �������� ������ �����ϸ鼭 ��� ����� �ۼ��غ�����.");
		Child2 child = new Child2();
	}
		
		public class Parent2 {
			public String nation;
			
			public Parent2() {
				this("���ѹα�");
				System.out.println("Parent() call");
			}
			
			public Parent2(String nation) {
				this.nation = nation;
				System.out.println("Parent2(String nation) call");		
			}

	}

}
public class Child2 extends Parent2{
	private String name;
	
	public Child2() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child2(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
/*
 * 
 * Parent(String nation) call

Parent() call

Child(String name) call

Child() call
 * 
 * 1. ���� Child Ŭ���� Ÿ���� child��� �̸��� ���� ��ü�� Child() �����ڸ� ����ؼ� ������.
 

2. �� �� Child�� Parent�� ��ӹ޴� Ŭ�����̹Ƿ� Parent�� �⺻ �������� parent()�� ȣ��ȴ�.

3. Parent�� �⺻ �����ڸ� ���캸�� String nation�� �Ķ���ͷ� ���� Parent�� �ٸ� �����ڿ� "���ѹα�"�� �����Ѵ�.

4. parent(String nation) �����ڰ� ����Ǹ� ���ڿ� ������ nation�� "���ѹα�"���� �ʱ�ȭ�Ѵ�.

5. �׸��� "Parent(String nation) call"�� ����Ѵ�.

6. parent(String nation) �������� ������ �� �������Ƿ� �ٽ� �⺻ �����ڷ� ���ư� "Parent() call"�� ����Ѵ�.

7. Parent ��ü�� ���������� �����Ǿ����� ���� Child�� �⺻ �����ڰ� ȣ��ȴ�.

8. 3~6���� ������ child() �����ڿ��� �����ϰ� ����ȴ�.*/