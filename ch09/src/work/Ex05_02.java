package work;

//������Ǯ��
public class Ex05_02 {

	Vehicle field=new Vehicle() {
		@Override
		public void run() {
			System.out.println("�ڵ����� �޸��ϴ�.");
		}};
		
	void method1() {
		//����
		  Vehicle localVar = new Vehicle() {
				@Override
				public void run() {
					System.out.println("�¿����� �޸��ϴ�.");
				}};
		  //�޼ҵ� ȣ��
		  localVar.run();
	  }
    void method2(Vehicle v) {
    	v.run();
    }
	  
public static void main(String[] args) {
	Ex05_02 annoy = new Ex05_02();
     annoy.field.run();
     annoy.method1();
     annoy.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
			}});
}
}

interface Vehicle{
	void run();
}